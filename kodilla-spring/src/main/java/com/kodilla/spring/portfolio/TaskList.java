package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private final List<String> tasks = new ArrayList<>();
    private final String task;

    public TaskList(String task) {
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    @Override
    public String toString() {
        return " " + tasks;
    }

}
