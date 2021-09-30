package com.kodilla.testing.collection;


import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

@DisplayName("When ArrayList is empty, " + "then the expectedArraySize should be 0")

@Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        ArrayList<Integer> allNumbers = new ArrayList<>(Arrays.asList());
        int expectedArraySize = 0;
        //When

        int size = allNumbers.size();
        //Then
        Assertions.assertEquals(expectedArraySize, size);

    }
    @DisplayName("When ArrayList contains odd and even numbers, " + "then exterminator should return only even numbers")

@Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        ArrayList<Integer> allNumbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        int expectedResult = 3;

        //When
        OddNumbersExterminator pick = new OddNumbersExterminator();
        pick.exterminate(allNumbers);
        int result = allNumbers.size()/2;


        //Then
        Assertions.assertEquals(3, result);
    }

}

