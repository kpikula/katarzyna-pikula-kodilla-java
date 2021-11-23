package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;
    @Autowired
    private TaskList toDoList;

    @Test
    void testBoardOfLists() {
        //Given
        toDoList.addTask("AAA");

        //When
        final var result = board.getToDoList().getTasks().get(0);

        //Then
        Assertions.assertEquals("AAA", result);
        Assertions.assertEquals(0, board.getInProgressList().getTasks().size());

    }
}
