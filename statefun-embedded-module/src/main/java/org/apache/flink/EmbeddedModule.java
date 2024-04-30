package org.apache.flink;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.auto.service.AutoService;
import org.apache.flink.statefun.sdk.kafka.KafkaIngressStartupPosition;
import org.apache.flink.statefun.sdk.spi.StatefulFunctionModule;
import org.apache.flink.statefun.sdk.kafka.KafkaIngressBuilder;
import java.util.Map;


@AutoService(StatefulFunctionModule.class)
public class EmbeddedModule implements StatefulFunctionModule {
    @Override
    public void configure(Map<String, String> map, Binder binder) {
        System.out.println("Configuring Embedded Module");
        binder.bindIngress(KafkaIngressBuilder
                .forIdentifier(Identifiers.INGRESS_IDENTIFIER)
                .withKafkaAddress("192.168.32.52:30009")
                .withConsumerGroupId("greeter")
                .withTopic("greeter-request")
                .withDeserializer(GreeterRequestDeserializer.class)
                .withStartupPosition(KafkaIngressStartupPosition.fromLatest())
                .build());

        binder.bindIngressRouter(
                Identifiers.INGRESS_IDENTIFIER,
                (greeterRequest, downstream) -> {
                    String key;
                    try {
                        key = new ObjectMapper().readValue(greeterRequest.getValue(), GreeterRequest.class).name;
                        System.out.println("Message key: " + key);
                    } catch (JsonProcessingException e) {
                        key = "NOT_PARSABLE";
                    }
                    System.out.println("Routing message with key: " + key);
                    downstream.forward(Identifiers.FUNCTION_TYPE, key, greeterRequest);
                });

        binder.bindFunctionProvider(Identifiers.FUNCTION_TYPE, x -> new GreeterFunction());
    }
}