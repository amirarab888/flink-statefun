package org.apache.flink.statefun.flink.io.http;

import org.apache.flink.statefun.sdk.IngressType;

public class Constants {
    private static final String NAMESPACE = "io.statefun.http";
    private static final String INGRESS = "ingress";

    public static final IngressType INGRESS_TYPE = new IngressType(NAMESPACE, INGRESS);

    public static final String DEFAULT_INGRESS_TYPE = "io.statefun.types/string";
    public static final String STATEFUN_CONTENT_TYPE_PREFIX = "application/vnd.";

    private Constants() {
        throw new UnsupportedOperationException("Should not be instantiated.");
    }
}
