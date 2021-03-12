package com.kodilla.good.patterns.flight.flight;

import java.util.HashSet;
import java.util.stream.Collectors;

public class FlightMessage {

    public void departureOf(HashSet<Flight> flightList, String departure) {
        System.out.println("\nList place of departure: " + "[ " + departure + " ]");
        System.out.println();

        flightList.stream()
                .filter(entry -> entry.getPlaceOfDeparture().equals(departure))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }

    public void arrivalOf(HashSet<Flight> flightList, String arrival) {
        System.out.println("\nList place of departure: " + "[ " + arrival + " ]");
        System.out.println();

        flightList.stream()
                .filter(entry -> entry.getPlaceOfDeparture().equals(arrival))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }
}