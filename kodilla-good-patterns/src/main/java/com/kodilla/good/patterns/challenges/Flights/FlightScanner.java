package com.kodilla.good.patterns.challenges.Flights;

import java.util.stream.Collectors;

public class FlightScanner {
    FlightBase flightSearch = new FlightBase();

    public void flightTo() {
        System.out.println("Flights to Katowice:");
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains("Katowice"))
                .forEach(System.out::println);
    }

    public void flightFrom() {
        System.out.println("\nFlights from Katowice:");
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getDepartureAirport().contains("Katowice"))
                .forEach(System.out::println);
    }

    public void flightThrough() {
        System.out.println("\nFlights through Katowice:");
        flightSearch.getFlight().stream()
                .filter(flight -> flight.getArrivalAirport().contains("Katowice") || flight.getDepartureAirport().contains("Katowice"))
                .forEach(System.out::println);
    }
}