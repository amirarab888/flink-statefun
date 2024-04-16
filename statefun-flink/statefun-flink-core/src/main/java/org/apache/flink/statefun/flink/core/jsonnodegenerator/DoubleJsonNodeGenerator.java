package org.apache.flink.statefun.flink.core.jsonnodegenerator;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.node.DoubleNode;
import org.apache.flink.table.data.RowData;

public class DoubleJsonNodeGenerator implements JsonNodeGenerator {
    @Override
    public JsonNode get(RowData rowData, int position) {
        return new DoubleNode(rowData.getDouble(position));
    }
}
