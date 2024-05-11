package org.apache.flink.statefun.flink.io.http.binders.ingress;

import com.google.auto.service.AutoService;
import java.util.Map;
import org.apache.flink.statefun.extensions.ExtensionModule;

@AutoService(ExtensionModule.class)
public final class Module implements ExtensionModule {
    @Override
    public void configure(Map<String, String> globalConfigurations, Binder binder) {
        binder.bindExtension(HttpIngressBinder.KIND_TYPE, HttpIngressBinder.INSTANCE);
    }
}
