package org.apache.flink.statefun.flink.io.spi;

import org.apache.flink.statefun.sdk.io.IngressSpec;

public interface DeltaConnectorSourceProvider {

    <T> DeltaSourceWrapper forSpec(IngressSpec<T> spec);
}
