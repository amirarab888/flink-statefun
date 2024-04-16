package org.apache.flink;

import java.io.Serializable;

public class TableFieldConfig implements Serializable {
    private final int position;
    private final String name;
    private final String type;

    public TableFieldConfig(int position, String name, String type) {
        this.position = position;
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public String getType() {
        return type;
    }
}
