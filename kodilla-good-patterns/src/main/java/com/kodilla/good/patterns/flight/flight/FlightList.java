package com.kodilla.good.patterns.flight.flight;

import java.util.HashSet;

public class FlightList {

    public static HashSet<Flight> flightList() {

        HashSet<Flight> flightList = new HashSet<>();

        flightList.add(new Flight("Gdańsk", "Warszawa", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Warszawa", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Szczecin", "Wrocław"));
        flightList.add(new Flight("Gdansk", "Rzeszów", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Kraków", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Poznań", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Zielona Góra", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Katowice", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Berlin", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Katowice", "Wrocław"));
        flightList.add(new Flight("Gdańsk", "Berlin", "Wrocław"));

        flightList.add(new Flight("Wrocław", "[-]", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Berlin", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Berlin", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Berlin", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Warszawa", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Szczecin", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Rzeszów", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Berlin", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Kraków", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Poznań", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Zielona Góra", "Gdańsk"));
        flightList.add(new Flight("Wrocław", "Zielona Góra", "Gdańsk"));

        flightList.add(new Flight("Warszawa", "Berlin", "Szwecja"));
        flightList.add(new Flight("Wrocław", "Kraków", "Gdańsk"));
        flightList.add(new Flight("Rzeszów", "Warszawa", "Malta"));
        flightList.add(new Flight("Poznań", "Lizbona", "Madryt"));
        flightList.add(new Flight("Poznań", "Gdańsk", "Kraków"));

        return flightList;
    }
}