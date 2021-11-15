package com.kodilla.good.patterns.challenges.Flights;

import java.util.stream.Collectors;

public class FlightScanner {
    private FlightBase flightSearch = new FlightBase();
    static private String KATOWICE = "Katowice";

    public void flightTo() {
        System.out.println("Flights to Katowice:");
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains(KATOWICE))
                .forEach(System.out::println);
    }

    public void flightFrom() {
        System.out.println("\nFlights from Katowice:");
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains(KATOWICE))
                .forEach(System.out::println);
    }

    public void flightThrough() {
        System.out.println("\nFlights through Katowice:");
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains(KATOWICE) || flight.getDepartureAirport().contains(KATOWICE))
                .forEach(System.out::println);
    }
}