package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        String result = flight.getArrivalAirport();
        HashMap<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Katowice", false);
        flightMap.put("Cracow", true);
        flightMap.put("Bydgoszcz", true);
        if (flightMap.containsKey(result)) {
            return flightMap.containsKey(result);

        } else {
            throw new RouteNotFoundException("Your flight cannot be found");


        }
    }



    public static void main(String[] args) {
        FlightSearch flightSearch = new FlightSearch();
        Flight flight = new Flight("Warsaw", "Radom");
//        HashMap<String, Boolean> newFlightMap = new HashMap<>();
//        newFlightMap.put("Katowice", false);
//        newFlightMap.put("Cracow", true);
//        newFlightMap.put("Bydgoszcz", true);

        try {
            flightSearch.findFlight(flight);
            System.out.println("You can book this flight");
        } catch (RouteNotFoundException e) {
            System.out.println("The arrival airport not found!!!");
        } finally {
            System.out.println("Thank you for choosing our airlines!");
        }
    }
}
