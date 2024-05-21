package org.apache.flink.statefun.flink.io.delta;


import io.delta.flink.source.DeltaSource;
import org.apache.flink.DeltaLakeIngressSpec;
import org.apache.flink.core.fs.Path;
import org.apache.flink.statefun.sdk.io.IngressSpec;
import org.apache.flink.streaming.api.functions.source.SourceFunction;
import org.apache.hadoop.conf.Configuration;
import org.apache.flink.statefun.flink.io.spi.SourceProvider;

public class DeltaLakeSourceProvider implements SourceProvider {
    @Override
    public <T> SourceFunction<T> forSpec(IngressSpec<T> ingressSpec) {
        DeltaLakeIngressSpec<T> spec = asKafkaSpec(ingressSpec);
        Configuration configuration = getConfiguration(spec.getDeltaLakeAddress(), spec.getAccessKey(), spec.getSecretKey());
        return new NewSourceFunction<>();
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
