package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.task.TaskList;
import com.kodilla.hibernate.task.dao.TaskDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    @Autowired
    private TaskDao taskDao;

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
        Integer id = taskList.getId();
        System.out.println("ID: " + id);
        taskListDao.deleteById(id);
    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("List name1", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

//        CleanUp
       taskListDao.delete(taskList);
    }
}
