package org.apache.flink;

import org.apache.flink.statefun.sdk.IngressType;

public class Constants {
    public static final IngressType DELTA_LAKE_INGRESS_TYPE =
            new IngressType("statefun.delta.io", "delta-lake-ingress");
    private Constants() {}
}
