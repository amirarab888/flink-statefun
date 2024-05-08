package org.apache.flink;

import org.apache.flink.com.google.protobuf.StringValue;
import org.apache.flink.statefun.sdk.kafka.KafkaIngressDeserializer;
import org.apache.kafka.clients.consumer.ConsumerRecord;

import java.nio.charset.StandardCharsets;

public class GreeterRequestDeserializer implements KafkaIngressDeserializer<StringValue> {
    @Override
    public StringValue deserialize(ConsumerRecord<byte[], byte[]> consumerRecord) {
        return StringValue.of(new String(consumerRecord.value(), StandardCharsets.UTF_8));
    }
}
