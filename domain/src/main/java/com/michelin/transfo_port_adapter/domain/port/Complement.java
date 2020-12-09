package com.michelin.transfo_port_adapter.domain.port;

public class Complement {
    private String id;
    private String value;

    public Complement(String id, String value) {
        this.id = id;
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
}
