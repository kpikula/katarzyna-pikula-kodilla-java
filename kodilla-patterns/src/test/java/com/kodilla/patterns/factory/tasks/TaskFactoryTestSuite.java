package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {
    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGGTASK);
        //Then
        Assertions.assertEquals("Shopping task is executed", shopping.executeTask());
        Assertions.assertEquals("Buy garden equipment", shopping.getTaskName());
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assertions.assertEquals("Driving task is executed", driving.executeTask());
        Assertions.assertEquals("Learn traffic signs", driving.getTaskName());
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGGTASK);
        //Then
        Assertions.assertEquals("Painting task is executed", painting.executeTask());
        Assertions.assertEquals("Paint the room", painting.getTaskName());
    }
}
