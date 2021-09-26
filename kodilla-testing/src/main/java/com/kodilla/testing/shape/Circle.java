package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {
    private int radius = 5;
    private double pi = 3.14;



    public String getShapeName() {
        return "circle";
    }
    public double getField() {
        return pi * radius * radius;
    }
    public Circle(int radius) {
        this.radius = radius;

    }
}

