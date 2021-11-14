package com.kodilla.good.patterns.challenges.Food2Door;

public class Supplier {
    private String name;

    public Supplier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "" +
                name;
    }
}
