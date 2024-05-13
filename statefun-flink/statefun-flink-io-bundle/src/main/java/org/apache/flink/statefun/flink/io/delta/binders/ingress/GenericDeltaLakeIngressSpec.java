package org.apache.flink.statefun.flink.io.delta.binders.ingress;

import org.apache.flink.com.google.protobuf.Message;
import org.apache.flink.DeltaLakeIngressBuilder;
import org.apache.flink.DeltaLakeIngressSpec;
import org.apache.flink.TableFieldConfig;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonCreator;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.core.JsonParser;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.DeserializationContext;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.flink.statefun.flink.io.common.json.IngressIdentifierJsonDeserializer;
import org.apache.flink.statefun.sdk.io.IngressIdentifier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


@JsonDeserialize(builder = GenericDeltaLakeIngressSpec.Builder.class)
public class GenericDeltaLakeIngressSpec {
    private final IngressIdentifier<Message> id;
    private final Optional<String> deltaLakeAddress;
    private final Optional<String> valueType;
    private final Optional<String> accessKey;
    private final Optional<String> secretKey;
    private final Optional<String> tablePath;
    private final Optional<String> targetNamespace;
    private final Optional<String> targetName;
    private final Optional<String> idFieldName;
    private final Optional<String> timestampIdFieldName;
    private final List<TableFieldConfig> tableFields;

    private GenericDeltaLakeIngressSpec(IngressIdentifier<Message> id, Optional<String> deltaLakeAddress, Optional<String> valueType,
                                        Optional<String> accessKey, Optional<String> secretKey, Optional<String> tablePath,
                                        Optional<String> targetNamespace, Optional<String> targetName, Optional<String> idFieldName,
                                        Optional<String> timestampIdFieldName, List<TableFieldConfig> tableFields) {
        this.id = id;
        this.deltaLakeAddress = deltaLakeAddress;
        this.valueType = valueType;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
        this.tablePath = tablePath;
        this.targetNamespace = targetNamespace;
        this.targetName = targetName;
        this.idFieldName = idFieldName;
        this.timestampIdFieldName = timestampIdFieldName;
        this.tableFields = tableFields;
    }

    public IngressIdentifier<Message> id() {
        return id;
    }

    public DeltaLakeIngressSpec<Message> toUniversalDeltaIngressSpec() {
        final DeltaLakeIngressBuilder<Message> builder = DeltaLakeIngressBuilder.forIdentifier(id);
        deltaLakeAddress.ifPresent(builder::withDeltaLakeAddress);
        valueType.ifPresent(builder::withValueType);
        accessKey.ifPresent(builder::withAccessKey);
        secretKey.ifPresent(builder::withSecretKey);
        tablePath.ifPresent(builder::withTablePath);
        targetNamespace.ifPresent(builder::withTargetNamespace);
        targetName.ifPresent(builder::withTargetName);
        idFieldName.ifPresent(builder::withIdFieldName);
        timestampIdFieldName.ifPresent(builder::withTimestampIdFieldName);
        tableFields.forEach(builder::withTableField);
        return builder.build();
    }

    @JsonPOJOBuilder
    public static class Builder {

        private final IngressIdentifier<Message> id;

        private Optional<String> deltaLakeAddress = Optional.empty();
        private Optional<String> valueType = Optional.empty();
        private Optional<String> accessKey = Optional.empty();
        private Optional<String> secretKey = Optional.empty();
        private Optional<String> tablePath = Optional.empty();
        private Optional<String> targetNamespace = Optional.empty();
        private Optional<String> targetName = Optional.empty();
        private Optional<String> idFieldName = Optional.empty();
        private Optional<String> timestampIdFieldName = Optional.empty();
        private List<TableFieldConfig> tableFields;

        @JsonCreator
        private Builder(
                @JsonProperty("id") @JsonDeserialize(using = IngressIdentifierJsonDeserializer.class)
                IngressIdentifier<Message> id) {
            this.id = Objects.requireNonNull(id);
        }

        @JsonProperty("address")
        public Builder withDeltaLakeAddress(String address) {
            Objects.requireNonNull(address);
            this.deltaLakeAddress = Optional.of(address);
            return this;
        }

        @JsonProperty("valueType")
        public Builder withValueType(String valueType) {
            Objects.requireNonNull(valueType);
            this.valueType = Optional.of(valueType);
            return this;
        }

        @JsonProperty("accessKey")
        public Builder withAccessKey(String accessKey) {
            Objects.requireNonNull(accessKey);
            this.accessKey = Optional.of(accessKey);
            return this;
        }

        @JsonProperty("secretKey")
        public Builder withSecretKey(String secretKey) {
            Objects.requireNonNull(secretKey);
            this.secretKey = Optional.of(secretKey);
            return this;
        }

        @JsonProperty("tablePath")
        public Builder withTablePath(String tablePath) {
            Objects.requireNonNull(tablePath);
            this.tablePath = Optional.of(tablePath);
            return this;
        }

        @JsonProperty("targetNamespace")
        public Builder withTargetNamespace(String targetNamespace) {
            Objects.requireNonNull(targetNamespace);
            this.targetNamespace = Optional.of(targetNamespace);
            return this;
        }

        @JsonProperty("targetName")
        public Builder withTargetName(String targetName) {
            Objects.requireNonNull(targetName);
            this.targetName = Optional.of(targetName);
            return this;
        }

        @JsonProperty("idFieldName")
        public Builder withIdFieldName(String idFieldName) {
            Objects.requireNonNull(idFieldName);
            this.idFieldName = Optional.of(idFieldName);
            return this;
        }

        @JsonProperty("timestampIdFieldName")
        public Builder withTimestampIdFieldName(String timestampIdFieldName) {
            Objects.requireNonNull(timestampIdFieldName);
            this.timestampIdFieldName = Optional.of(timestampIdFieldName);
            return this;
        }

        @JsonProperty("tableFields")
        @JsonDeserialize(using = TableFieldConfigsJsonDeserializer.class)
        public Builder withTableFields(List<TableFieldConfig> tableFields) {
            Objects.requireNonNull(tableFields);
            this.tableFields = Objects.requireNonNull(tableFields);
            return this;
        }

        public GenericDeltaLakeIngressSpec build() {
            return new GenericDeltaLakeIngressSpec(id,
                    deltaLakeAddress,
                    valueType,
                    accessKey,
                    secretKey,
                    tablePath,
                    targetNamespace,
                    targetName,
                    idFieldName,
                    timestampIdFieldName,
                    tableFields);
        }

        private static class TableFieldConfigsJsonDeserializer
                extends JsonDeserializer<List<TableFieldConfig>> {
            @Override
            public List<TableFieldConfig> deserialize(
                    JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
                final ObjectNode[] objectNodes = jsonParser.readValueAs(ObjectNode[].class);
                List<TableFieldConfig> tableFieldConfigs = new ArrayList<>();
                for (ObjectNode objectNode : objectNodes) {
                    int position = objectNode.get("position").asInt();
                    String name = objectNode.get("name").asText();
                    String type = objectNode.get("type").asText();
                    tableFieldConfigs.add(new TableFieldConfig(position, name, type));
                }
                return tableFieldConfigs;
            }
        }
    }

}
