package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country{
    private final String countryName;
    private final BigDecimal populationQuantity;

    public Country(final String countryName,final BigDecimal populationQuantity){
        this.countryName = countryName;
        this.populationQuantity = populationQuantity;
    }

    public String getCountryName(){
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return populationQuantity;
    }
}
