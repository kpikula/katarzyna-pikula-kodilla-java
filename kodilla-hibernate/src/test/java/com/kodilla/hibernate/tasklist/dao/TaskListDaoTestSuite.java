package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("New list", "This is a new list to perform the test");
        taskListDao.save(taskList);
        //When
        String listName = taskList.getListName();
        List<TaskList> readTaskList = taskListDao.findByListName("New list");
        //Then
        Assertions.assertEquals("New list", listName);
        // CleanUp
        taskListDao.deleteAll();
    }
}
