package com.kodilla.good.patterns.challenges.Flights;

import java.util.HashSet;
import java.util.Set;

public class FlightBase {
    private final Set<Flight> allFlights = new HashSet<>();

    public FlightBase() {
        allFlights.add(new Flight("Gdańsk", "Wrocław"));
        allFlights.add(new Flight("Katowice", "Wrocław"));
        allFlights.add(new Flight("Gdańsk", "Katowice"));
        allFlights.add(new Flight("Wrocław", "Katowice"));
        allFlights.add(new Flight("Poznań", "Katowice"));
        allFlights.add(new Flight("Katowice", "Poznań"));
    }

    public Set<Flight> getFlight() {
        return allFlights;
    }

    @Override
    public String toString() {
        return "";
    }
}
