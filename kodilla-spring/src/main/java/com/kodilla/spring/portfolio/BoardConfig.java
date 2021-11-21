package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    @Scope("prototype")
    public Board toDoListCreate() {
        Board toDoList = new Board();
        return toDoList;
    }

//    @Bean
//    public Board inProgressListCreate() {
//        Board inProgressList = new Board();
//        return inProgressList;
//    }
//
//    @Bean
//    public Board doneListCreate() {
//        Board doneList = new Board();
//        return doneList;
//    }

}
