package org.apache.flink.statefun.flink.io.delta;


//import io.delta.flink.source.DeltaSource;
import com.google.protobuf.ByteString;
import org.apache.flink.DeltaLakeIngressSpec;
import org.apache.flink.core.fs.Path;
import org.apache.flink.statefun.flink.io.generated.AutoRoutable;
import org.apache.flink.statefun.flink.io.generated.RoutingConfig;
import org.apache.flink.statefun.flink.io.generated.TargetFunctionType;
import org.apache.flink.statefun.flink.io.spi.DeltaConnectorSourceProvider;
//import org.apache.flink.statefun.flink.io.spi.DeltaSourceWrapper;
import org.apache.flink.statefun.flink.io.spi.SourceProvider;
import org.apache.flink.statefun.sdk.io.IngressSpec;
import org.apache.flink.statefun.sdk.reqreply.generated.TypedValue;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.hadoop.conf.Configuration;

import java.util.Random;

public class DeltaLakeSourceProvider implements SourceProvider {
    @Override
    public <T> SourceFunction<T> forSpec(IngressSpec<T> ingressSpec) {
       return new DummySource();
    }

    private Configuration getConfiguration(String deltaLakeAddress, String accessKey, String secretKey) {
        Configuration config = new Configuration();
        config.set("fs.s3a.endpoint", deltaLakeAddress);
        config.set("fs.s3a.access.key", accessKey);
        config.set("fs.s3a.secret.key", secretKey);
        config.set("fs.s3a.path.style.access", "true");
        config.set("fs.s3a.impl", "org.apache.hadoop.fs.s3a.S3AFileSystem");
        config.set("fs.s3a.aws.credentials.provider", "org.apache.hadoop.fs.s3a.SimpleAWSCredentialsProvider");
        return config;
    }

    private static <T> DeltaLakeIngressSpec<T> asKafkaSpec(IngressSpec<T> ingressSpec) {
        if (ingressSpec instanceof DeltaLakeIngressSpec) {
            return (DeltaLakeIngressSpec<T>) ingressSpec;
        }
        if (ingressSpec == null) {
            throw new NullPointerException("Unable to translate a NULL spec");
        }
        throw new IllegalArgumentException(String.format("Wrong type %s", ingressSpec.type()));
    }

}

class DummySource<T> implements SourceFunction<T>{

    @Override
    public void run(SourceContext<T> sourceContext) throws Exception {
        Random random = new Random();
        TargetFunctionType targetFunctionType = TargetFunctionType.newBuilder().setNamespace("com.ververica.stateful-functions").setType("greeter").build();
        RoutingConfig routingConfig = RoutingConfig.newBuilder().setTypeUrl("dummy").addTargetFunctionTypes(targetFunctionType).build();
        int randomNumber;
        for (Integer i=0; i<100; i++) {
            randomNumber = random.nextInt();

            AutoRoutable typedValue = AutoRoutable.newBuilder().setId(randomNumber + "")
                    .setConfig(routingConfig)
                    .build();
            sourceContext.collect((T)typedValue);
        }
    }

    @Override
    public void cancel() {

    }
}
