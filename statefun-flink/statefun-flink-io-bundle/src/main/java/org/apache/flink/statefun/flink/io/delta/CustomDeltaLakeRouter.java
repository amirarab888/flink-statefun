package org.apache.flink.statefun.flink.io.delta;


import com.google.protobuf.ByteString;
import com.google.protobuf.Message;
import org.apache.flink.statefun.flink.io.generated.AutoRoutable;
import org.apache.flink.statefun.sdk.FunctionType;
import org.apache.flink.statefun.sdk.io.Router;
import org.apache.flink.statefun.sdk.reqreply.generated.TypedValue;

import java.util.Calendar;


public class CustomDeltaLakeRouter implements Router<Message> {
    private final FunctionType functionType;
    public CustomDeltaLakeRouter(FunctionType functionType) {
        this.functionType = functionType;
    }

    @Override
    public void route(Message message, Downstream<Message> downstream) {
        AutoRoutable autoRoutable = (AutoRoutable) message;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        String key = autoRoutable.getId() + hour;
        downstream.forward(functionType, key, typedValuePayload(autoRoutable.getConfig().getTypeUrl(), autoRoutable.getPayloadBytes()));
    }

    private static TypedValue typedValuePayload(String typeUrl, ByteString payloadBytes) {
        return TypedValue.newBuilder()
                .setTypename(typeUrl)
                .setHasValue(true)
                .setValue(payloadBytes)
                .build();
    }
}
