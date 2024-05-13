package org.apache.flink.statefun.flink.core;

import org.apache.flink.com.google.protobuf.ByteString;
import org.apache.flink.TableFieldConfig;
import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.flink.statefun.flink.core.jsonnodegenerator.JsonNodeGeneratorFactory;
import org.apache.flink.io.generated.AutoRoutable;
import org.apache.flink.io.generated.RoutingConfig;
import org.apache.flink.table.data.RowData;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class RowDataToMessageMapFunction extends RichMapFunction<RowData, AutoRoutable> {
    private final String idFieldName;
    private final RoutingConfig routingConfig;
    private final List<TableFieldConfig> tableFields;
    private final JsonNodeGeneratorFactory nodeGeneratorFactory;

    public RowDataToMessageMapFunction(String idFieldName, RoutingConfig routingConfig, List<TableFieldConfig> tableFields, JsonNodeGeneratorFactory nodeGeneratorFactory) {
        this.idFieldName = idFieldName;
        this.routingConfig = routingConfig;
        this.tableFields = tableFields;
        this.nodeGeneratorFactory = nodeGeneratorFactory;
    }

    @Override
    public AutoRoutable map(RowData value) throws Exception {
        ObjectNode objectNode = new ObjectMapper().createObjectNode();
        String id = "";
        String timeId = "";
        for (TableFieldConfig tableFieldConfig : tableFields) {
            int position = tableFieldConfig.getPosition();
            String name = tableFieldConfig.getName();
            String type = tableFieldConfig.getType();
            JsonNode node = nodeGeneratorFactory.getJsonNodeGenerator(type).get(value, position);
            objectNode.set(name, node);
            if (name.equals(idFieldName)) {
                id = node.asText();
            } else if (name.equals("Start_Time_s")) {
                Timestamp timestamp1 = new Timestamp(Long.parseLong(node.asText()) * 1000);
                LocalDateTime localDateTime = timestamp1.toLocalDateTime();
                localDateTime = localDateTime.withMinute(0).withSecond(0).withNano(0);
                timeId = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
            }
        }
        return AutoRoutable.newBuilder()
                .setId(id + "," + timeId)
                .setPayloadBytes(ByteString.copyFromUtf8(objectNode.toString()))
                .setConfig(routingConfig)
                .build();
    }
}
