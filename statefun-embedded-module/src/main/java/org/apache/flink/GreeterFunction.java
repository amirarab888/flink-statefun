package org.apache.flink;

import org.apache.flink.statefun.sdk.Context;
import org.apache.flink.statefun.sdk.StatefulFunction;
import org.apache.flink.generated.TypedValue;

import java.util.concurrent.atomic.AtomicInteger;

public class GreeterFunction implements StatefulFunction {
    static AtomicInteger counter = new AtomicInteger(0);
    static long time = 0;
    @Override
    public void invoke(Context context, Object greeterRequest) {
        int value = counter.incrementAndGet();
        if (value == 1) {
            long t = System.currentTimeMillis();
            System.out.println("First message received in: " + t);
            time = t;
        }
        else if (value % 100000 == 0) {
            long t = System.currentTimeMillis();
            System.out.println("100k message received in: " + (t - time));
            time = t;
            System.out.println(((TypedValue) greeterRequest).getValue().toStringUtf8());
        }
    }
}