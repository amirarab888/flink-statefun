package org.apache.flink.statefun.flink.io.delta;

import com.google.auto.service.AutoService;
import org.apache.flink.Constants;
import org.apache.flink.statefun.flink.io.spi.FlinkIoModule;

import java.util.Map;

@AutoService(FlinkIoModule.class)
public class DeltaLakeIoModule implements FlinkIoModule {
    @Override
    public void configure(Map<String, String> map, Binder binder) {
        binder.bindSourceProvider(Constants.DELTA_LAKE_INGRESS_TYPE, new DeltaLakeSourceProvider());
    }
}
