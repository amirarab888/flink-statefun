package org.apache.flink;


import org.apache.flink.statefun.sdk.io.IngressIdentifier;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DeltaLakeIngressBuilder<T> {
    private final IngressIdentifier<T> id;
    private String deltaLakeAddress;
    private String valueType;
    private String accessKey;
    private String secretKey;
    private String tablePath;
    private String targetNamespace;
    private String targetName;
    private String idFieldName;
    private List<TableFieldConfig> tableFields = new ArrayList<>();

    private DeltaLakeIngressBuilder(IngressIdentifier<T> id) {
        this.id = Objects.requireNonNull(id);
    }

    public static <T> DeltaLakeIngressBuilder<T> forIdentifier(IngressIdentifier<T> id) {
        return new DeltaLakeIngressBuilder<>(id);
    }

    public DeltaLakeIngressBuilder<T> withDeltaLakeAddress(String deltaLakeAddress) {
        this.deltaLakeAddress = deltaLakeAddress;
        return this;
    }

    public DeltaLakeIngressBuilder<T> withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    public DeltaLakeIngressBuilder<T> withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public DeltaLakeIngressBuilder<T> withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public DeltaLakeIngressBuilder<T> withTablePath(String tablePath) {
        this.tablePath = tablePath;
        return this;
    }

    public DeltaLakeIngressBuilder<T> withTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
        return this;
    }

    public DeltaLakeIngressBuilder<T> withTargetName(String targetName) {
        this.targetName = targetName;
        return this;
    }

    public DeltaLakeIngressBuilder<T> withIdFieldName(String idFieldName) {
        this.idFieldName = idFieldName;
        return this;
    }

    public DeltaLakeIngressBuilder<T> withTableField(TableFieldConfig tableFieldConfig) {
        this.tableFields.add(tableFieldConfig);
        return this;
    }

    public DeltaLakeIngressSpec<T> build() {
        return new DeltaLakeIngressSpec<>(id, deltaLakeAddress, valueType, accessKey, secretKey, tablePath, targetNamespace, targetName, idFieldName, tableFields);
    }
}