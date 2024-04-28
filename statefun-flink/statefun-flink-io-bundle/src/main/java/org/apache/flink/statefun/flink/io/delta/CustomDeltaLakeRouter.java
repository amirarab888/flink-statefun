package org.apache.flink.statefun.flink.io.delta;


import com.google.protobuf.Message;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonProcessingException;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.statefun.sdk.FunctionType;
import org.apache.flink.statefun.sdk.io.Router;
import org.apache.flink.statefun.sdk.reqreply.generated.TypedValue;

import java.util.Calendar;


public class CustomDeltaLakeRouter implements Router<Message> {
    private final FunctionType functionType;
    private final String idFieldName;

    public CustomDeltaLakeRouter(FunctionType functionType, String idFieldName) {
        this.functionType = functionType;
        this.idFieldName = idFieldName;
    }

    @Override
    public void route(Message message, Downstream<Message> downstream) {
        String key;
        Calendar calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        try {
            key = new ObjectMapper().readTree(((TypedValue) message).getValue().toStringUtf8()).get(idFieldName).asText() + hour;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        downstream.forward(functionType, key, message);
    }
}
