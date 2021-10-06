package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> continentCountries = new ArrayList<>();

    public Continent(final String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }


    public List<Country> getContinentCountries() {
        return continentCountries;
    }

    public void addCountryToContinent(Country country) {
        continentCountries.add(country);
    }


    @Override

    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + continentCountries +
                '}';
    }


}

