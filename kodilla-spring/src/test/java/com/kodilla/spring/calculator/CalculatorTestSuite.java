package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTestSuite {
    @Autowired
    Calculator calculator;

    @Test
    public void testAdd() {
        //Given
        //When
        calculator.add(45, 15);
        //Then
        //do nothing
    }

    @Test
    public void testSub() {
        //Given
        //When
        calculator.sub(45, 15);
        //Then
        //do nothing
    }

    @Test
    public void testMul() {
        //Given
        //When
        calculator.mul(45, 15);
        //Then
        //do nothing
    }

    @Test
    public void testDiv() {
        //Given
        //When
        calculator.div(45, 15);
        //Then
        //do nothing
    }
}


