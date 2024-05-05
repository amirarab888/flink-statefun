package org.apache.flink;

import com.google.auto.service.AutoService;
import org.apache.flink.statefun.sdk.spi.StatefulFunctionModule;
import java.util.Map;


@AutoService(StatefulFunctionModule.class)
public class EmbeddedModule implements StatefulFunctionModule {
    @Override
    public void configure(Map<String, String> map, Binder binder) {
        binder.bindFunctionProvider(Identifiers.FUNCTION_TYPE, x -> new GreeterFunction());
    }
}