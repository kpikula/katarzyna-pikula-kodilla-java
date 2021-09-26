package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {
    private double triangleSide;
    private double triangleHeight;

    public String getShapeName() {
        return "triangle";
    }

    public double getField() {
        return triangleHeight * triangleSide * 0.5;
    }

    public Triangle(double triangleHeight, double triangleSide) {
        this.triangleHeight = triangleHeight;
        this.triangleSide = triangleSide;

    }
}

