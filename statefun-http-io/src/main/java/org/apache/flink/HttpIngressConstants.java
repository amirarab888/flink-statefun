package org.apache.flink;

import org.apache.flink.com.google.protobuf.Message;
import org.apache.flink.statefun.sdk.IngressType;
import org.apache.flink.statefun.sdk.io.IngressIdentifier;

public class HttpIngressConstants {
    private static final String NAMESPACE = "io.statefun.http";
    private static final String INGRESS = "ingress";
    public static final IngressType INGRESS_TYPE = new IngressType(NAMESPACE, INGRESS);
    public static final IngressIdentifier<Message> INGRESS_IDENTIFIER =
            new IngressIdentifier<>(Message.class, NAMESPACE, INGRESS);


    private HttpIngressConstants() {
        throw new UnsupportedOperationException("Should not be instantiated.");
    }
}
