package com.kodilla.testing.shape;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCount = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("Starting test process...");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("End of test.");
    }

    @Before
    public void beforeEveryTest() {
        testCount++;
        System.out.println("Starting test number: " + testCount);
    }


    @Nested
    @DisplayName("test add figure")
    class AddFigure {
        @Test
        public void testAddFigure() { //test add sqare
            //Given
            Square square = new Square(8);
            ShapeCollector shapeCollector = new ShapeCollector(square);
            //When
            shapeCollector.addFigure(square);
            //Then
            Assertions.assertTrue(shapeCollector.showFigures().contains(square));
        }
    }
    @Nested
    @DisplayName("Test Remove Figure")
    class RemoveFigure {
        @Test
        public void testRemoveFigure() { //add figure square cicrle triangle and then test remove figure triangle
            //Given
            Circle circle = new Circle(6);
            Square square = new Square(8);
            Triangle triangle = new Triangle(9, 7);
            ShapeCollector shapeCollector = new ShapeCollector(triangle);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //When
            shapeCollector.removeFigure(triangle);
            //Then
            Assertions.assertTrue(shapeCollector.showFigures().contains(circle));
            Assertions.assertTrue(shapeCollector.showFigures().contains(square));
            Assertions.assertFalse(shapeCollector.showFigures().contains(triangle));
        }
    }
    @Nested
    @DisplayName("Test Get Figure")
    class GetFigure {
        @Test
        public void testGetFigure() { //test get square figure

            //Given
            Square square = new Square(8);
            ShapeCollector shapeCollector = new ShapeCollector(square);
            shapeCollector.addFigure(square);
            //When
            Shape figure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(square, figure);
        }
    }
    @Nested
    @DisplayName("Show Figures")
    class ShowFigures {
        @Test
        public void testShowFigures() { // test show all figures

            //Given
            Circle circle = new Circle(6);
            Square square = new Square(15);
            Triangle triangle = new Triangle(9, 6);
            ShapeCollector shapeCollector = new ShapeCollector(square);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //When
            ArrayList<Shape> figures = shapeCollector.showFigures();
            //Then
            Assertions.assertTrue(figures.contains(circle));
            Assertions.assertTrue(figures.contains(square));
            Assertions.assertTrue(figures.contains(triangle));
        }
    }
}