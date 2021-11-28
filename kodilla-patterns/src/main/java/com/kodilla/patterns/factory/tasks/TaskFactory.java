package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String DRIVINGTASK = "DRIVING TASK";
    public static final String SHOPPINGGTASK = "SHOPPING TASK";
    public static final String PAINTINGGTASK = "PAINTING TASK";

    public final Task makeTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Learn traffic signs", "Katowice", "car");
            case SHOPPINGGTASK:
                return new ShoppingTask("Buy garden equipment", "lawn mower", 1);
            case PAINTINGGTASK:
                return new PaintingTask("Paint the room", "white", "living room");
            default:
                return null;
        }
    }
}