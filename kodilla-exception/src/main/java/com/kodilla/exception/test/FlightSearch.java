package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {
    public void findFlight(Flight flight) throws RouteNotFoundException {
        HashMap<String, Boolean> flightMap = new HashMap<>();
        String result = flight.getArrivalAirport();
        if (flightMap.containsKey(result)) {
            System.out.println("Your flight has been found");
        } else {
            throw new RouteNotFoundException("Your flight cannot be found");
        }
    }

    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("Warsaw", "Radom");
        HashMap<String, Boolean> newFlightMap = new HashMap<>();
        newFlightMap.put("Katowice", false);
        newFlightMap.put("Cracow", true);
        newFlightMap.put("Bydgoszcz", true);

        try {
            flightSearch.findFlight(flight);
        } catch (RouteNotFoundException e) {
            System.out.println("The arrival airport not found!!!");
        }
    }
}
