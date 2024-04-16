package org.apache.flink.statefun.flink.io.delta;

import io.delta.flink.source.DeltaSource;
import org.apache.flink.TableFieldConfig;
import org.apache.flink.statefun.flink.io.spi.DeltaSourceWrapper;
import org.apache.flink.table.data.RowData;

import java.util.List;


public class DeltaSourceWrapperImpl implements DeltaSourceWrapper {
    private final DeltaSource<RowData> deltaSource;
    private final String valueType;
    private final List<TableFieldConfig> tableFields;

    public DeltaSourceWrapperImpl(DeltaSource<RowData> deltaSource, String valueType, List<TableFieldConfig> tableFields) {
        this.deltaSource = deltaSource;
        this.valueType = valueType;
        this.tableFields = tableFields;
    }

    @Override
    public DeltaSource<RowData> getDeltaSource() {
        return deltaSource;
    }

    @Override
    public String getValueType() {
        return valueType;
    }

    @Override
    public List<TableFieldConfig> getTableFields() {
        return tableFields;
    }
}
