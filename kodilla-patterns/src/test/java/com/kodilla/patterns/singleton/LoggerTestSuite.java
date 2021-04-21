package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private static Logger logger;

    @BeforeAll
    public static void createLogger() {
        logger = Logger.INSTANCE;
        logger.log("TEST THE LAST LOG");
    }

    @AfterAll
    public static void lastLogger() {
        logger.getLastLog();
    }

    @Test
    void testGetLastLog() {
        //Given
        //When
        String result = "TEST THE LAST LOG";
        //Then
        assertEquals(result,logger.getLastLog());
    }
}
