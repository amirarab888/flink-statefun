package org.apache.flink;

import org.apache.flink.com.google.protobuf.ByteString;
import org.apache.flink.egress.generated.KafkaProducerRecord;
import org.apache.flink.statefun.sdk.Context;
import org.apache.flink.statefun.sdk.annotations.Persisted;
import org.apache.flink.statefun.sdk.io.EgressIdentifier;
import org.apache.flink.statefun.sdk.java.ApiExtension;
import org.apache.flink.statefun.sdk.state.PersistedValue;
import org.apache.flink.statefun.sdk.StatefulFunction;
import org.apache.flink.generated.TypedValue;
import org.apache.flink.statefun.sdk.TypeName;

import java.util.ArrayList;




public class GreeterFunction implements StatefulFunction {
    private static final org.apache.flink.statefun.sdk.java.TypeName KAFKA_PRODUCER_RECORD_TYPENAME =
            org.apache.flink.statefun.sdk.java.TypeName.typeNameOf(
                    "type.googleapis.com", KafkaProducerRecord.getDescriptor().getFullName());
    private static final String SQM_NAMESPACE = "sqm.types";
    private static final TypeName SEARCH_TYPE = new TypeName(SQM_NAMESPACE, "search");
    private static final TypeName LOG_TYPE = new TypeName(SQM_NAMESPACE, "log");
    @Persisted
    private final PersistedValue<ArrayList> logState = PersistedValue.of("count", ArrayList.class);
    @Override
    public void invoke(Context context, Object greeterRequest) {
        TypedValue message = (TypedValue) greeterRequest;
        String messageTypeNameString = message.getTypename();
        if (messageTypeNameString.equals(SEARCH_TYPE.canonicalTypenameString())) {
            ArrayList<Object> stringArrayList = logState.getOrDefault(new ArrayList());
            StringBuilder result = new StringBuilder("[");
            for (int i=0; i< stringArrayList.size(); i++) {
                if (i != 0) {
                    result.append(", ");
                }
                result.append(stringArrayList.get(i).toString());
            }
            result.append("]");
            KafkaProducerRecord record = KafkaProducerRecord.newBuilder()
                    .setKey(context.self().id())
                    .setValueBytes(ByteString.copyFromUtf8(result.toString()))
                    .setTopic("processed-messages")
                    .build();
            TypedValue typedValue = TypedValue.newBuilder()
                    .setTypenameBytes(ApiExtension.typeNameByteString(KAFKA_PRODUCER_RECORD_TYPENAME))
                    .setValue(record.toByteString())
                    .setHasValue(true)
                    .build();

            context.send(new EgressIdentifier<>("greeter.io", "processed-messages", TypedValue.class), typedValue);
            System.out.println("Search message received");
        } else if (messageTypeNameString.equals(LOG_TYPE.canonicalTypenameString())) {
            ArrayList<Object> stringArrayList = logState.getOrDefault(new ArrayList());
            stringArrayList.add(message.getValue());
            logState.set(stringArrayList);
        }
    }
}