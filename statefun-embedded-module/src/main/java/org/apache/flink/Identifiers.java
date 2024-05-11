package org.apache.flink;

import org.apache.flink.statefun.sdk.FunctionType;

public class Identifiers {
    public static final FunctionType FUNCTION_TYPE =
            new FunctionType("com.ververica.stateful-functions", "greeter");
}