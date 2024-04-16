package org.apache.flink.statefun.flink.core.jsonnodegenerator;

import java.util.HashMap;
import java.util.Map;

public class DefaultJsonNodeGeneratorFactory implements JsonNodeGeneratorFactory {
    private final Map<String, JsonNodeGenerator> jsonNodeGeneratorMap;

    public DefaultJsonNodeGeneratorFactory() {
        jsonNodeGeneratorMap = new HashMap<>();
        registerDefaultJsonNodeGenerators();
    }

    private void registerDefaultJsonNodeGenerators() {
        jsonNodeGeneratorMap.put("int", new IntJsonNodeGenerator());
        jsonNodeGeneratorMap.put("string", new StringJsonNodeGenerator());
        jsonNodeGeneratorMap.put("float", new FloatJsonNodeGenerator());
        jsonNodeGeneratorMap.put("double", new DoubleJsonNodeGenerator());
        jsonNodeGeneratorMap.put("long", new LongJsonNodeGenerator());
        jsonNodeGeneratorMap.put("timestamp", new TimestampJsonNodeGenerator());
        jsonNodeGeneratorMap.put("bigint", new BigintJsonNodeGenerator());
    }

    @Override
    public JsonNodeGenerator getJsonNodeGenerator(String type) {
        return jsonNodeGeneratorMap.getOrDefault(type, new DefaultJsonNodeGenerator());
    }
}
