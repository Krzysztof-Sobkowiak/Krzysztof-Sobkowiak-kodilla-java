package com.kodilla.good.patterns.flight;

import com.kodilla.good.patterns.flight.flight.Flight;
import com.kodilla.good.patterns.flight.flight.FlightMessage;

import java.util.HashSet;

import static com.kodilla.good.patterns.flight.flight.FlightList.flightList;

public class Main {
    public static void main(String args[]) {

        FlightMessage flightMessage = new FlightMessage();
        String departure = "Gdańsk";
        String optional = "Bydgoszcz";
        String arrival = "Wrocław";

        Flight flight = new Flight(departure, optional, arrival);

        HashSet<Flight> flightList = flightList();

        if(flight.getAlternativePlace() == optional) {
            System.out.println("\nSelected flight : [" + flight + "]");
            System.out.println("Sorry, the selected direct flight is not available");
            flightMessage.departureOf(flightList,departure);
            flightMessage.arrivalOf(flightList, arrival);
        } else {
            System.out.println("Your flight [" + flight + "] is available");

        }
    }
}
