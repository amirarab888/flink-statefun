package org.apache.flink.statefun.flink.io.delta.binders.ingress;


import com.google.auto.service.AutoService;
import org.apache.flink.statefun.extensions.ExtensionModule;

import java.util.Map;

@AutoService(ExtensionModule.class)
public final class Module implements ExtensionModule {

    @Override
    public void configure(Map<String, String> globalConfigurations, Binder universeBinder) {
        universeBinder.bindExtension(DeltaLakeIngressBinder.KIND_TYPE, DeltaLakeIngressBinder.INSTANCE);
    }
}
