package org.apache.flink.statefun.flink.io.delta;

import org.apache.flink.com.google.protobuf.ByteString;
import org.apache.flink.generated.TypedValue;
import org.apache.flink.io.generated.AutoRoutable;
import org.apache.flink.io.generated.RoutingConfig;
import org.apache.flink.io.generated.TargetFunctionType;
import org.apache.flink.streaming.api.functions.source.SourceFunction;

public class NewSourceFunction<T> implements SourceFunction<T> {
    @Override
    public void run(SourceContext<T> sourceContext) throws Exception {
        int i =0;
        while (i < 6000000) {
            RoutingConfig routingConfig = RoutingConfig.newBuilder().setTypeUrl("sqm.types/log").addTargetFunctionTypes(TargetFunctionType.newBuilder()
                    .setNamespace("com.ververica.stateful-functions").setType("greeter").build()).build();
            AutoRoutable autoRoutable = AutoRoutable.newBuilder()
                    .setId(String.valueOf(i % 10000))
                    .setPayloadBytes(ByteString.copyFromUtf8(String.valueOf(i)))
                    .setConfig(routingConfig)
                    .build();
            sourceContext.collect((T) autoRoutable);
            i++;
        }
        while (true) {
            Thread.sleep(1000);
        }
    }

    @Override
    public void cancel() {

    }
}
