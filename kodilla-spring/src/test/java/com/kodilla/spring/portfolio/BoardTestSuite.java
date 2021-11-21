package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void createToDoListTest() {
        //Given

        //When
        board.toDoListAdd(new TaskList("AAA"));
        //Then
        System.out.println(board.toString());
    }

    @Test
    void createInProgressListTest() {
        //Given

        //When
        board.inProgressListAdd(new TaskList("BBB"));
        //Then
        System.out.println(board.toString());
    }

    @Test
    void createDoneListTest() {
        //Given

        //When
        board.doneListAdd(new TaskList("CCC"));
        //Then
        System.out.println(board.toString());
    }
}
