package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigMacTestSuite {
    @Test
    void testNewBigMac() {
        //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                .ingredient("lettuce")
                .bun("w/sesame")
                .sauce("1000 islands")
                .ingredient("onion")
                .ingredient("chilli pepper")
                .burgers(2)
                .ingredient("bacon")
                .ingredient("cheese")
                .ingredient("shrimps")
                .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients = bigMac.getIngredients().size();
        //Then
        assertEquals(6, howManyIngredients);
        assertEquals("w/sesame", bigMac.getBun());
        assertEquals("1000 islands", bigMac.getSauce());
        assertEquals(2, bigMac.getBurgers());
    }
}
