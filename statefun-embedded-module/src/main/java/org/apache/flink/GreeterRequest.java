package org.apache.flink;

public class GreeterRequest {
    public String name;

    public GreeterRequest() {}
    public GreeterRequest(String name) {
        this.name = name;
    }
}