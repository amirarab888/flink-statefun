package org.apache.flink;

import com.google.protobuf.StringValue;
import org.apache.flink.statefun.sdk.kafka.KafkaIngressDeserializer;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.nio.charset.StandardCharsets;

public class GreeterRequestDeserializer implements KafkaIngressDeserializer<StringValue> {
    @Override
    public StringValue deserialize(ConsumerRecord<byte[], byte[]> consumerRecord) {
        System.out.println("Deserializing message: " + new String(consumerRecord.value(), StandardCharsets.UTF_8));
        return StringValue.of(new String(consumerRecord.value(), StandardCharsets.UTF_8));
    }
}
