package com.kodilla.spring.portfolio;

public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    @Override
    public String toString() {
        return "To-do-task: " + toDoList + "; in-progress-task: " + inProgressList + "; done-task: " + doneList;
    }
}
