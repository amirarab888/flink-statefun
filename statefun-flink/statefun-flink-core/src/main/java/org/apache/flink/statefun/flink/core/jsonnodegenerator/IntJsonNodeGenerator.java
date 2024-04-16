package org.apache.flink.statefun.flink.core.jsonnodegenerator;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.node.IntNode;
import org.apache.flink.table.data.RowData;

public class IntJsonNodeGenerator implements JsonNodeGenerator {
    @Override
    public JsonNode get(RowData rowData, int position) {
        return new IntNode(rowData.getInt(position));
    }
}
