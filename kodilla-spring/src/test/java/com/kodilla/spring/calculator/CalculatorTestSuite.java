package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculation() {
        // Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        // When
        double add = calculator.add(2.3, 3.3);
        double substract = calculator.sub(5.5, 3.2);
        double multiple = calculator.mul(6.5, 4.4);
        double divide = calculator.div(15.4, 2.2);

        // Then
        assertEquals(5.6, add);
        assertEquals(2.3, substract);
        assertEquals(28.6, multiple);
        assertEquals(7.0, divide);
    }
}