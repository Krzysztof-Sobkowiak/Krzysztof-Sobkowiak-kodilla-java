package com.kodilla.exception.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("Test exception handling ")
public class SecondChallengeTestSuite{
    @DisplayName("Test when x and y are expect values")
    @Test
    void testWhenXAndYAreExpectValues() throws Exception{
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

                //When & Then
                assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(2.0,1.5));
    }
    @DisplayName("Test when x is not the expected value")
    @Test
    void testWhenXIsNotTheExpectedValue() throws Exception{
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(1.99,1.5));
    }

    @DisplayName("Test when y is not equal to 1.5 ")
    @Test
    void testWhenYIsNotTheExpectedValue() throws Exception{
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertThrows(Exception.class,() -> secondChallenge.probablyIWillThrowException(2.0,1.49));
    }
    @DisplayName("Test when x and y are not expected values")
    @Test
    void testWhenXAndYAreNotExpectedValues() throws Exception{
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99,1.49));
    }
}