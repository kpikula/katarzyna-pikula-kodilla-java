package com.kodilla.good.patterns.challenges.Flights;

import java.util.stream.Collectors;

public class FlightScanner {
    private FlightBase flightSearch = new FlightBase();
    private String searchedAirport;

    public FlightScanner(String searchedAirport) {
        this.searchedAirport = searchedAirport;
    }

    public void flightTo() {
        System.out.println("Flights to: " + searchedAirport);
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains(searchedAirport))
                .forEach(System.out::println);
    }

    public void flightFrom() {
        System.out.println("\nFlights to: " + searchedAirport);
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains(searchedAirport))
                .forEach(System.out::println);
    }

    public void flightThrough() {
        System.out.println("\nFlights to: " + searchedAirport);
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains(searchedAirport) || flight.getDepartureAirport().contains(searchedAirport))
                .forEach(System.out::println);
    }
}