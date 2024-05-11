package org.apache.flink;

import org.apache.flink.statefun.sdk.IngressType;
import org.apache.flink.statefun.sdk.io.IngressIdentifier;
import org.apache.flink.statefun.sdk.io.IngressSpec;

import java.util.List;
import java.util.Objects;

public class DeltaLakeIngressSpec<T> implements IngressSpec<T> {
    private final IngressIdentifier<T> ingressIdentifier;
    private final String deltaLakeAddress;
    private final String valueType;
    private final String accessKey;
    private final String secretKey;
    private final String tablePath;
    private final String targetNamespace;
    private final String targetName;
    private final String idFieldName;
    private final List<TableFieldConfig> tableFields;

    DeltaLakeIngressSpec(IngressIdentifier<T> id, String deltaLakeAddress, String valueType, String accessKey, String secretKey,
                         String tablePath, String targetNamespace, String targetName, String idFieldName, List<TableFieldConfig> tableFields) {
        this.ingressIdentifier = Objects.requireNonNull(id);
        this.deltaLakeAddress = deltaLakeAddress;
        this.valueType = valueType;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.tablePath = tablePath;
        this.targetNamespace = targetNamespace;
        this.targetName = targetName;
        this.idFieldName = idFieldName;
        this.tableFields = tableFields;
    }
    @Override
    public IngressIdentifier<T> id() {
        return ingressIdentifier;
    }

    @Override
    public IngressType type() {
        return DeltaIngressConstants.DELTA_LAKE_INGRESS_TYPE;
    }

    public String getDeltaLakeAddress() {
        return deltaLakeAddress;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public String getTablePath() {
        return tablePath;
    }

    public String getValueType() {
        return valueType;
    }

    public String getTargetNamespace() {
        return targetNamespace;
    }

    public String getTargetName() {
        return targetName;
    }

    public String getIdFieldName() {
        return idFieldName;
    }

    public List<TableFieldConfig> getTableFields() {
        return tableFields;
    }

}
