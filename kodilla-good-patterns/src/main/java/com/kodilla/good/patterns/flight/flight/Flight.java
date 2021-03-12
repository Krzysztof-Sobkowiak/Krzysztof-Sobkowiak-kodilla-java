package com.kodilla.good.patterns.flight.flight;

public class Flight {

    private final String placeOfDeparture;
    private final String alternativePlace;
    private final String placeOfArrival;

    public Flight(String placeOfDeparture, String alternativePlace, String placeOfArrival) {
        this.placeOfDeparture = placeOfDeparture;
        this.alternativePlace = alternativePlace;
        this.placeOfArrival = placeOfArrival;
    }

    public String getPlaceOfDeparture() {
        return placeOfDeparture;
    }

    public String getAlternativePlace() {
        return alternativePlace;
    }

    public String getPlaceOfArrival() {
        return placeOfArrival;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(! (o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if(! getPlaceOfDeparture().equals(flight.getPlaceOfDeparture())) return false;
        if(! getAlternativePlace().equals(flight.getAlternativePlace())) return false;
        return getPlaceOfArrival().equals(flight.getPlaceOfArrival());
    }

    @Override
    public int hashCode() {
        int result = getPlaceOfDeparture().hashCode();
        result = 31 * result + getAlternativePlace().hashCode();
        result = 31 * result + getPlaceOfArrival().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight " + "place of departure --> " + placeOfDeparture + " --> Optional: " + alternativePlace + " --> place of arrival " + placeOfArrival;
    }
}