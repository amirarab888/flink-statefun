package org.apache.flink.statefun.flink.io.http;


import org.apache.flink.statefun.flink.io.spi.SourceProvider;
import org.apache.flink.HttpIngressSpec;
import org.apache.flink.statefun.sdk.io.IngressSpec;
import org.apache.flink.streaming.api.functions.source.SourceFunction;

public class HttpSourceProvider implements SourceProvider {
    @Override
    public <T> SourceFunction<T> forSpec(IngressSpec<T> spec) {
        final HttpIngressSpec ingressSpec = asPlaygroundIngressSpec(spec);

        return new HttpSource<>(ingressSpec.getPort());
    }

    private static <T> HttpIngressSpec asPlaygroundIngressSpec(IngressSpec<T> spec) {
        if (spec instanceof HttpIngressSpec) {
            return (HttpIngressSpec) spec;
        }

        throw new IllegalArgumentException(String.format("Unknown ingress spec %s", spec));
    }
}
