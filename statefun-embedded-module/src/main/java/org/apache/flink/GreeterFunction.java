package org.apache.flink;

import org.apache.flink.com.google.protobuf.ByteString;
import org.apache.flink.egress.generated.KafkaProducerRecord;
import org.apache.flink.generated.TypedValue;
import org.apache.flink.statefun.sdk.Context;
import org.apache.flink.statefun.sdk.StatefulFunction;
import org.apache.flink.statefun.sdk.TypeName;
import org.apache.flink.statefun.sdk.annotations.Persisted;
import org.apache.flink.statefun.sdk.io.EgressIdentifier;
import org.apache.flink.statefun.sdk.java.ApiExtension;
import org.apache.flink.statefun.sdk.state.Expiration;
import org.apache.flink.statefun.sdk.state.PersistedValue;

import java.time.Duration;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;


public class GreeterFunction implements StatefulFunction {
    private static final org.apache.flink.statefun.sdk.java.TypeName KAFKA_PRODUCER_RECORD_TYPENAME =
            org.apache.flink.statefun.sdk.java.TypeName.typeNameOf(
                    "type.googleapis.com", KafkaProducerRecord.getDescriptor().getFullName());
    private static final String SQM_NAMESPACE = "sqm.types";
    private static final TypeName SEARCH_TYPE = new TypeName(SQM_NAMESPACE, "search");
    private static final TypeName LOG_TYPE = new TypeName(SQM_NAMESPACE, "log");
    @Persisted
    private final PersistedValue<ArrayList> logState = PersistedValue.of("count", ArrayList.class, Expiration.expireAfterWriting(Duration.ofDays(90L)));

    private static AtomicInteger count = new AtomicInteger(0);
    @Override
    public void invoke(Context context, Object greeterRequest) {
        TypedValue message = (TypedValue) greeterRequest;
        String messageTypeNameString = message.getTypename();
        if (messageTypeNameString.equals(SEARCH_TYPE.canonicalTypenameString())) {
            handleSearchMessage(context);
        } else if (messageTypeNameString.equals(LOG_TYPE.canonicalTypenameString())) {
            if (count.incrementAndGet() < 1000) {
                handleLogMessage(context, message);
            }
        }
    }

    private void handleLogMessage(Context context, TypedValue message) {
        ArrayList stringArrayList = logState.getOrDefault(new ArrayList());
        System.out.println("Id in logs:" + context.self().id() + " state size: " + stringArrayList.size());
        stringArrayList.add(message.getValue().toStringUtf8());
        logState.set(stringArrayList);
    }

    private void handleSearchMessage(Context context) {
        ArrayList<Object> stringArrayList = logState.getOrDefault(new ArrayList());
        System.out.println("Id in search:" + context.self().id() + " state size: " + stringArrayList.size());
        String result = createResult(stringArrayList);
        System.out.println("Result created");
        KafkaProducerRecord kafkaProducerRecord = KafkaProducerRecord.newBuilder()
                .setKey(context.self().id())
                .setValueBytes(ByteString.copyFromUtf8(result))
                .setTopic("processed-messages")
                .build();
        System.out.println("KafkaProducerRecord created");
        TypedValue typedValue = TypedValue.newBuilder()
                .setTypenameBytes(ApiExtension.typeNameByteString(KAFKA_PRODUCER_RECORD_TYPENAME))
                .setValue(kafkaProducerRecord.toByteString())
                .setHasValue(true)
                .build();
        System.out.println("TypedValue created");
        context.send(new EgressIdentifier<>("greeter.io", "processed-messages", TypedValue.class), typedValue);
        System.out.println("TypedValue sent");
    }

    private static String createResult(ArrayList<Object> stringArrayList) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (i != 0) {
                result.append(", ");
            }
            result.append(stringArrayList.get(i).toString());
        }
        result.append("]");
        return result.toString();
    }
}