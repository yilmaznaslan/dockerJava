package com.yilmaznaslan;

public class Bus {
    private final String id;
    private final int capacity;

    public Bus(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }
}
