package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

//    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
//        this.toDoList = toDoList;
//        this.inProgressList = inProgressList;
//        this.doneList = doneList;
//    }

    public void toDoListAdd(TaskList toDoList) {
        toDoList.addTask("AAA_AAA");
//        System.out.println(toDoList);
    }

    public void inProgressListAdd(TaskList inProgressList) {
        inProgressList.addTask("BBB_BBB");
//        System.out.println(inProgressList);
    }

    public void doneListAdd(TaskList doneList) {
        doneList.addTask("CCC_CCC");
    }

    @Override
    public String toString() {
        return "To-do-task: " + toDoList + "; in-progress-task: " + inProgressList + "; done-task: " + doneList;
    }
}
