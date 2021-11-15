package com.kodilla.good.patterns.challenges.Flights;

import java.util.stream.Collectors;

public class FlightScanner {
    private FlightBase flightSearch = new FlightBase();
    static private String SEARCH_AIRPORT = "Wrocław";

    public void flightTo() {
        System.out.println("Flights to: " + SEARCH_AIRPORT);
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains(SEARCH_AIRPORT))
                .forEach(System.out::println);
    }

    public void flightFrom() {
        System.out.println("\nFlights to: " + SEARCH_AIRPORT);
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains(SEARCH_AIRPORT))
                .forEach(System.out::println);
    }

    public void flightThrough() {
        System.out.println("\nFlights to: " + SEARCH_AIRPORT);
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains(SEARCH_AIRPORT) || flight.getDepartureAirport().contains(SEARCH_AIRPORT))
                .forEach(System.out::println);
    }
}