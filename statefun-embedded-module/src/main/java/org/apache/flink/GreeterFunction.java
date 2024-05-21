package org.apache.flink;

import org.apache.flink.statefun.sdk.Context;
import org.apache.flink.statefun.sdk.StatefulFunction;
import org.apache.flink.statefun.sdk.annotations.Persisted;
import org.apache.flink.statefun.sdk.state.PersistedValue;

import java.util.concurrent.atomic.AtomicInteger;

public class GreeterFunction implements StatefulFunction {
    static boolean shouldThrow = true;
    @Persisted
    private final PersistedValue<Integer> logState = PersistedValue.of("count", Integer.class);
    static AtomicInteger counter = new AtomicInteger(0);
    static long time = 0;

    @Override
    public void invoke(Context context, Object greeterRequest) {
        if (context.self().id().equals(String.valueOf(1000)) && logState.getOrDefault(0).equals(250) && shouldThrow) {
            shouldThrow = false;
            throw new RuntimeException("Should throw exception");
        }
        int number = logState.getOrDefault(0);
        number++;
        logState.set(number);
        int value = counter.incrementAndGet();
        if (value == 1) {
            long t = System.currentTimeMillis();
            System.out.println("First message received in: " + t);
            time = t;
        } else if (value % 100000 == 0) {
            long t = System.currentTimeMillis();
            System.out.println("100k message received in: " + (t - time));
            time = t;
//            System.out.println(((TypedValue) greeterRequest).getValue().toStringUtf8());
        }
    }
}