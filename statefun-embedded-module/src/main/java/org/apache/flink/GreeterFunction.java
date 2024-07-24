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
import org.apache.flink.statefun.sdk.state.PersistedAppendingBuffer;

import java.time.Duration;


public class GreeterFunction implements StatefulFunction {
    private static final org.apache.flink.statefun.sdk.java.TypeName KAFKA_PRODUCER_RECORD_TYPENAME =
            org.apache.flink.statefun.sdk.java.TypeName.typeNameOf(
                    "type.googleapis.com", KafkaProducerRecord.getDescriptor().getFullName());
    private static final String SQM_NAMESPACE = "sqm.types";
    private static final TypeName SEARCH_TYPE = new TypeName(SQM_NAMESPACE, "search");
    private static final TypeName LOG_TYPE = new TypeName(SQM_NAMESPACE, "log");
    @Persisted
    private final PersistedAppendingBuffer<String> logState2 = PersistedAppendingBuffer.of("count", String.class, Expiration.expireAfterWriting(Duration.ofDays(90L)));
    @Override
    public void invoke(Context context, Object greeterRequest) {
        TypedValue message = (TypedValue) greeterRequest;
        String messageTypeNameString = message.getTypename();
        if (messageTypeNameString.equals(LOG_TYPE.canonicalTypenameString())) {
            handleLogMessage(message);
        } else if (messageTypeNameString.equals(SEARCH_TYPE.canonicalTypenameString())) {
            handleSearchMessage(context);
        }
    }

    private void handleLogMessage(TypedValue message) {
        logState2.append(message.getValue().toStringUtf8());
    }

    private void handleSearchMessage(Context context) {
        Iterable<String> stringArrayList = logState2.view();
        String result = createResult(stringArrayList);
        KafkaProducerRecord kafkaProducerRecord = KafkaProducerRecord.newBuilder()
                .setKey(context.self().id())
                .setValueBytes(ByteString.copyFromUtf8(result))
                .setTopic("")
                .build();
        TypedValue typedValue = TypedValue.newBuilder()
                .setTypenameBytes(ApiExtension.typeNameByteString(KAFKA_PRODUCER_RECORD_TYPENAME))
                .setValue(kafkaProducerRecord.toByteString())
                .setHasValue(true)
                .build();
        context.send(new EgressIdentifier<>("greeter.io", "processed-messages", TypedValue.class), typedValue);
    }

    private static String createResult(Iterable<String> stringArrayList) {
        StringBuilder result = new StringBuilder("[");
        boolean first = true;
        for (String next : stringArrayList) {
            if (first) {
                first = false;
            } else {
                result.append(", ");
            }
            result.append(next);
        }
        result.append("]");
        return result.toString();
    }
}