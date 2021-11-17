package com.kodilla.good.patterns.challenges.Flights;

public class FlightScannerApplication {
    public static void main(String[] args) {
        FlightScanner flightScanner = new FlightScanner("Katowice");
        flightScanner.flightTo();
        flightScanner.flightFrom();
        flightScanner.flightThrough();
    }
}
