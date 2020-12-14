package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("When create resultList with emptyList, " +
            "then resultList should return empty list")

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given

        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list" + resultList);
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }
    @DisplayName("When created normalList with numbers, " +
            "then result should return list without even numbers")

    @Test
    public void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<Integer>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);
        normalList.add(10);

        List<Integer> result = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing the list without even numbers " + result);
        assertEquals(Arrays.asList(2, 4, 6, 8, 10), result);

    }
}