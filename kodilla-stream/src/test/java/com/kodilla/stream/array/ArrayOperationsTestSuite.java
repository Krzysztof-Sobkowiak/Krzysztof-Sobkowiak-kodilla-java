package com.kodilla.stream.array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite{
    @DisplayName("Calculating the numbers of a 20 element array")
    @Test
    void testGetAverage(){
        //Given
        int numbers[] = {155,15,11,156,223,114,112,455,489,623,156,12,78,98,65,21,156,789,1520,102};

        //When
        double result = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(267.5,result);
    }
}
