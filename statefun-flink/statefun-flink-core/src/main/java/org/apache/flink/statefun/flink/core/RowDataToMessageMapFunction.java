package org.apache.flink.statefun.flink.core;

import com.google.protobuf.ByteString;
import org.apache.flink.TableFieldConfig;
import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.flink.statefun.flink.core.jsonnodegenerator.JsonNodeGeneratorFactory;
import org.apache.flink.statefun.sdk.reqreply.generated.TypedValue;
import org.apache.flink.table.data.RowData;

import java.util.List;

public class RowDataToMessageMapFunction extends RichMapFunction<RowData, TypedValue> {
    private final String valueType;
    private final List<TableFieldConfig> tableFields;
    private final JsonNodeGeneratorFactory nodeGeneratorFactory;

    public RowDataToMessageMapFunction(String valueType, List<TableFieldConfig> tableFields, JsonNodeGeneratorFactory nodeGeneratorFactory) {
        this.valueType = valueType;
        this.tableFields = tableFields;
        this.nodeGeneratorFactory = nodeGeneratorFactory;
    }

    @Override
    public TypedValue map(RowData value) throws Exception {
        ObjectNode objectNode = new ObjectMapper().createObjectNode();
        for (TableFieldConfig tableFieldConfig : tableFields) {
            int position = tableFieldConfig.getPosition();
            String name = tableFieldConfig.getName();
            String type = tableFieldConfig.getType();
            objectNode.set(name, nodeGeneratorFactory.getJsonNodeGenerator(type).get(value, position));
        }
        return TypedValue.newBuilder()
                .setHasValue(true)
                .setValue(ByteString.copyFrom(objectNode.toString(), "UTF-8"))
                .setTypename(valueType)
                .build();
    }
}
