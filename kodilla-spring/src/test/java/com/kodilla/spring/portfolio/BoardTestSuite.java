package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        // When
        board.getToDoList().addTask("To Do List");
        board.getInProgressList().addTask("In Progress List");
        board.getDoneList().addTask("Done List");

        // Then
        assertEquals("To Do List", board.getToDoList().getTask(0));
        assertEquals("In Progress List", board.getInProgressList().getTask(0));
        assertEquals("Done List", board.getDoneList().getTask(0));
    }
}