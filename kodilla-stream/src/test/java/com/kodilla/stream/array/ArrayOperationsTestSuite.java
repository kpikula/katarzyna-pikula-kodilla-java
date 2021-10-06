package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    void testArray() {
        //Given
        int[] numbers = {10, 15, 20, 25};

        //When
        final double average = ArrayOperations.getAverage(numbers);

        //Then
        Assertions.assertEquals(17.5, average);

    }


}




