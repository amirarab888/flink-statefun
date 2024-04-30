package org.apache.flink;

import org.apache.flink.statefun.sdk.Context;
import org.apache.flink.statefun.sdk.StatefulFunction;

public class GreeterFunction implements StatefulFunction {
    @Override
    public void invoke(Context context, Object greeterRequest) {
        System.out.println("Message recieved");
        System.out.println("Hello there, " + context.self().id() + "!");
    }
}