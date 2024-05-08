package org.apache.flink;

import org.apache.flink.com.google.protobuf.StringValue;
import org.apache.flink.statefun.sdk.FunctionType;
import org.apache.flink.statefun.sdk.io.IngressIdentifier;

public class Identifiers {
    public static final IngressIdentifier<StringValue> INGRESS_IDENTIFIER =
            new IngressIdentifier<>(StringValue.class, "com.ververica.stateful-functions", "greeter-request");
    public static final FunctionType FUNCTION_TYPE =
            new FunctionType("com.ververica.stateful-functions", "greeter");
}