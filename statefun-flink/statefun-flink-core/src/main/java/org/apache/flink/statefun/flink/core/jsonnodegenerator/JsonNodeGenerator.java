package org.apache.flink.statefun.flink.core.jsonnodegenerator;

import org.apache.flink.shaded.jackson2.com.fasterxml.jackson.databind.JsonNode;
import org.apache.flink.table.data.RowData;

import java.io.Serializable;

public interface JsonNodeGenerator extends Serializable {
    JsonNode get(RowData rowData, int position);
}
