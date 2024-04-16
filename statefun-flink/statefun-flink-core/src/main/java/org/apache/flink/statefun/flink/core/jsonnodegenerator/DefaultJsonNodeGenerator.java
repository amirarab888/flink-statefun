package org.apache.flink.statefun.flink.core.jsonnodegenerator;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.flink.table.data.RowData;

public class DefaultJsonNodeGenerator implements JsonNodeGenerator {

    @Override
    public JsonNode get(RowData rowData, int position) {
        return new ObjectMapper().nullNode();
    }
}
