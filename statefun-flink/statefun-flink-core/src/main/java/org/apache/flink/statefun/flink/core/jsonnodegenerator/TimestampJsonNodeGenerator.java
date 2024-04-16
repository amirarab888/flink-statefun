package org.apache.flink.statefun.flink.core.jsonnodegenerator;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.node.TextNode;
import org.apache.flink.table.data.RowData;

public class TimestampJsonNodeGenerator implements JsonNodeGenerator {
    @Override
    public JsonNode get(RowData rowData, int position) {
        return new TextNode(rowData.getString(position).toString());
    }
}

