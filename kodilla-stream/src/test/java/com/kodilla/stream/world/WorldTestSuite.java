package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Country country1 = new Country("Poland", new BigDecimal("45000000"));
        Country country2 = new Country("Egypt", new BigDecimal("95000000"));
        Country country3 = new Country("Germany", new BigDecimal("20000000000"));
        Country country4 = new Country("Kongo", new BigDecimal("150000000"));
        Country country5 = new Country("France", new BigDecimal("49000000"));
        Continent europe = new Continent("Europe");
        Continent africa = new Continent("Africa");

        europe.addCountryToContinent(country1);
        europe.addCountryToContinent(country3);
        europe.addCountryToContinent(country5);
        africa.addCountryToContinent(country2);
        africa.addCountryToContinent(country4);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(africa);

        BigDecimal expected = new BigDecimal("20339000000");

        //When
        final BigDecimal peopleQuantity = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(expected, peopleQuantity);
    }
}
