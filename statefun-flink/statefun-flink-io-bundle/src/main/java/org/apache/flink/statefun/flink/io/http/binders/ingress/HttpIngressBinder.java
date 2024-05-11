package org.apache.flink.statefun.flink.io.http.binders.ingress;

import org.apache.flink.HttpIngressSpec;
import org.apache.flink.statefun.extensions.ComponentBinder;
import org.apache.flink.statefun.extensions.ComponentJsonObject;
import org.apache.flink.statefun.flink.io.common.AutoRoutableProtobufRouter;
import org.apache.flink.statefun.flink.io.http.binders.Utils;
import org.apache.flink.statefun.sdk.TypeName;
import org.apache.flink.statefun.sdk.spi.StatefulFunctionModule;

public class HttpIngressBinder implements ComponentBinder {

    static final HttpIngressBinder INSTANCE = new HttpIngressBinder();
    static final TypeName KIND_TYPE = TypeName.parseFrom("io.statefun.http.v1/ingress");

    @Override
    public void bind(
            ComponentJsonObject component, StatefulFunctionModule.Binder remoteModuleBinder) {
        Utils.validateComponent(component, KIND_TYPE);
        final HttpIngressSpec playgroundIngressSpec =
                Utils.parseJson(component.specJsonNode(), HttpIngressSpec.class);

        remoteModuleBinder.bindIngress(playgroundIngressSpec);
        remoteModuleBinder.bindIngressRouter(
                playgroundIngressSpec.id(), new AutoRoutableProtobufRouter());
    }
}
