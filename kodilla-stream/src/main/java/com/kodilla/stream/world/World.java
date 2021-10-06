package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;


public class World {

    public final Set<Continent> worldContinents = new HashSet<>();

    public void addContinent(Continent continent) {
        worldContinents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return worldContinents.stream()
                .flatMap(continent -> continent.getContinentCountries().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

}

