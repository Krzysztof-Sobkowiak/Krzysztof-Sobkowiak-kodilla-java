package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Factory Tasks")
public class TaskFactoryTestSuite {

    @DisplayName("Test Factory Shopping Task")
    @Test
    void testShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPING_TASK);

        //Then
        assertEquals("Fruit", shopping.getTaskName());
        assertEquals("Shopping: Fruit, what to buy: Apple, quantitty: 5.0",shopping.executeTask());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @DisplayName("Test Factory Painting Task")
    @Test
    void testPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.makeTask(TaskFactory.PAINTING_TASK);

        //Then
        assertEquals("Wall", painting.getTaskName());
        assertEquals("Painting: Wall, Color: Red, What to paint: Human Face",painting.executeTask());
        assertEquals(true, painting.isTaskExecuted());
    }

    @DisplayName("Test Factory Driving Task")
    @Test
    void testDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.makeTask(TaskFactory.DRIVING_TASK);

        //Then
        assertEquals("Holidays", driving.getTaskName());
        assertEquals("Driving: Holidays, where: France, using: Taxi",driving.executeTask());
        assertEquals(true, driving.isTaskExecuted());

    }
}