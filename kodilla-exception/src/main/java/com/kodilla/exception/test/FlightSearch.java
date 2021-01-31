package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch{
    public void findFlight(Flight flight) throws RouteNotFoundException{

        Map<String,Boolean> listOfFlight = new HashMap<>();
        listOfFlight.put("Poznań",true);
        listOfFlight.put("Argentina",false);

        Boolean departureAirport = listOfFlight.get(flight.getDepartureAirport());
        Boolean arrivalAirport = listOfFlight.get(flight.getArrivalAirport());

        if(departureAirport == null || arrivalAirport == null){
           throw new RouteNotFoundException("Sorry, flight from - " + flight.getDepartureAirport() + " - to - " + flight.getArrivalAirport() +
                   " The selected flight doesn`t exist, it`s not on the our list.");
        } else {
            System.out.println("The selected flight is on the our list, departing from - " +
                    flight.getDepartureAirport() + " - to - " + flight.getArrivalAirport());
        }
    }
    public static void main(String[] args){
        FlightSearch flightFinder = new FlightSearch();

        try {
            System.out.println("Processing Flight Search");
            flightFinder.findFlight(new Flight("Poznań", "London"));
        } catch (RouteNotFoundException e){
            System.out.println("Error # " + e);
        } finally {
            System.out.println("Process flight search was done. \nFind new flight.");
        }

        try {
            System.out.println("\nProcessing Flight Search");
            flightFinder.findFlight(new Flight("Poznań", "Argentina"));
        } catch (RouteNotFoundException e){
            System.out.println("Error # " + e);
        } finally {
            System.out.println("Process flight search was done. \nFind new flight.");
        }
    }
}
