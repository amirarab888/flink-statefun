package org.apache.flink.statefun.flink.io.delta;

import com.google.auto.service.AutoService;
import org.apache.flink.DeltaIngressConstants;
import org.apache.flink.statefun.flink.io.spi.FlinkIoModule;

import java.util.Map;

@AutoService(FlinkIoModule.class)
public class DeltaLakeFlinkIoModule implements FlinkIoModule {
    @Override
    public void configure(Map<String, String> map, Binder binder) {
        binder.bindDeltaConnectorSourceProvider(DeltaIngressConstants.DELTA_LAKE_INGRESS_TYPE, new DeltaLakeSourceProvider());
    }
}
