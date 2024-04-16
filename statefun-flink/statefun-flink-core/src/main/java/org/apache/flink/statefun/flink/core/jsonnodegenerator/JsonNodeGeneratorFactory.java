package org.apache.flink.statefun.flink.core.jsonnodegenerator;

import java.io.Serializable;

public interface JsonNodeGeneratorFactory extends Serializable {
    JsonNodeGenerator getJsonNodeGenerator(String type);
}
