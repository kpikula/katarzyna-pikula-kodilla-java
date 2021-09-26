package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape {

    private int sideLength;


    public String getShapeName() {
        return "square";
    }

    public double getField() {
        return sideLength * sideLength;
    }

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
}
