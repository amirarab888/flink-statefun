package org.apache.flink.statefun.flink.io.delta.binders.ingress;

import org.apache.flink.com.google.protobuf.Message;
import org.apache.flink.DeltaLakeIngressSpec;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.statefun.extensions.ComponentBinder;
import org.apache.flink.statefun.extensions.ComponentJsonObject;
import org.apache.flink.statefun.flink.common.json.StateFunObjectMapper;
import org.apache.flink.statefun.flink.io.delta.CustomDeltaLakeRouter;
import org.apache.flink.statefun.sdk.FunctionType;
import org.apache.flink.statefun.sdk.TypeName;
import org.apache.flink.statefun.sdk.spi.StatefulFunctionModule;

public class DeltaLakeIngressBinder implements ComponentBinder {
    private static final ObjectMapper SPEC_OBJ_MAPPER = StateFunObjectMapper.create();

    static final DeltaLakeIngressBinder INSTANCE = new DeltaLakeIngressBinder();

    static final TypeName KIND_TYPE = TypeName.parseFrom("io.statefun.delta/ingress");

    private DeltaLakeIngressBinder() {}

    @Override
    public void bind(ComponentJsonObject component, StatefulFunctionModule.Binder remoteModuleBinder) {
        validateComponent(component);
        final JsonNode specJsonNode = component.specJsonNode();
        final GenericDeltaLakeIngressSpec spec = parseSpec(specJsonNode);
        DeltaLakeIngressSpec<Message> deltaLakeIngressSpec = spec.toUniversalDeltaIngressSpec();
        remoteModuleBinder.bindIngress(deltaLakeIngressSpec);
        remoteModuleBinder.bindIngressRouter(spec.id(),
                new CustomDeltaLakeRouter(new FunctionType(deltaLakeIngressSpec.getTargetNamespace(), deltaLakeIngressSpec.getTargetName())));
    }


    private static void validateComponent(ComponentJsonObject componentJsonObject) {
        final TypeName targetBinderType = componentJsonObject.binderTypename();
        if (!targetBinderType.equals(KIND_TYPE)) {
            throw new IllegalStateException(
                    "Received unexpected ModuleComponent to bind: " + componentJsonObject);
        }
    }

    private static GenericDeltaLakeIngressSpec parseSpec(JsonNode specJsonNode) {
        try {
            return SPEC_OBJ_MAPPER.treeToValue(specJsonNode, GenericDeltaLakeIngressSpec.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException("Error parsing a GenericDeltaLakeIngressSpec.", e);
        }
    }
}
