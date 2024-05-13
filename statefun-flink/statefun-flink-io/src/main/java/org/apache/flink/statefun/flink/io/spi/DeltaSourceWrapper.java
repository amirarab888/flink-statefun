package org.apache.flink.statefun.flink.io.spi;

import io.delta.flink.source.DeltaSource;
import org.apache.flink.TableFieldConfig;
import org.apache.flink.io.generated.RoutingConfig;
import org.apache.flink.table.data.RowData;

import java.util.List;

public interface DeltaSourceWrapper {

    DeltaSource<RowData> getDeltaSource();

    String getIdFieldName();

    String getTimestampIdFieldName();

    RoutingConfig getRoutingConfig();

    List<TableFieldConfig> getTableFields();
}
