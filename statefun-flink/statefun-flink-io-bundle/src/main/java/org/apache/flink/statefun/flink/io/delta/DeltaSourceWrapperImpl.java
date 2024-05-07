//package org.apache.flink.statefun.flink.io.delta;
//
//import io.delta.flink.source.DeltaSource;
//import org.apache.flink.TableFieldConfig;
//import org.apache.flink.statefun.flink.io.generated.RoutingConfig;
//import org.apache.flink.statefun.flink.io.generated.TargetFunctionType;
//import org.apache.flink.statefun.flink.io.spi.DeltaSourceWrapper;
//import org.apache.flink.table.data.RowData;
//
//import java.util.List;
//
//
//public class DeltaSourceWrapperImpl implements DeltaSourceWrapper {
//    private final DeltaSource<RowData> deltaSource;
//    private final String idFieldName;
//    private final RoutingConfig routingConfig;
//    private final List<TableFieldConfig> tableFields;
//
//    public DeltaSourceWrapperImpl(DeltaSource<RowData> deltaSource, String idFieldName, String namespace,
//                                  String name, String valueType, List<TableFieldConfig> tableFields) {
//        this.deltaSource = deltaSource;
//        this.idFieldName = idFieldName;
//        this.tableFields = tableFields;
//        TargetFunctionType targetFunctionType = TargetFunctionType.newBuilder()
//                .setNamespace(namespace)
//                .setType(name)
//                .build();
//        this.routingConfig = RoutingConfig
//                .newBuilder()
//                .setTypeUrl(valueType)
//                .addTargetFunctionTypes(targetFunctionType)
//                .build();
//    }
//
//    @Override
//    public DeltaSource<RowData> getDeltaSource() {
//        return deltaSource;
//    }
//
//    @Override
//    public String getIdFieldName() {
//        return idFieldName;
//    }
//
//    @Override
//    public RoutingConfig getRoutingConfig() {
//        return routingConfig;
//    }
//
//    @Override
//    public List<TableFieldConfig> getTableFields() {
//        return tableFields;
//    }
//}
