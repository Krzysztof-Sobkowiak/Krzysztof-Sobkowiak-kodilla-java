package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @DisplayName("Test of calulate population in the world ")
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("42631298415"));
        Country spain = new Country("Spain", new BigDecimal("234554434"));
        Country france = new Country("France", new BigDecimal("45435435455"));
        Country austria = new Country("Austria", new BigDecimal("354534544"));
        Country finland = new Country("Finland", new BigDecimal("657785434534"));
        Country sweden = new Country("Sweden", new BigDecimal("543543453"));
        Country italy = new Country("Italy", new BigDecimal("5304855777"));
        Country china = new Country("China", new BigDecimal("8778787857788"));
        Country india = new Country("India", new BigDecimal("2878727772"));
        Country japan = new Country("Japan", new BigDecimal("53434554044"));
        Country mongolia = new Country("Mongolia", new BigDecimal("2544538887"));
        Country argentina = new Country("Argentina", new BigDecimal("323256220555"));
        Country canada = new Country("Canada", new BigDecimal("3452545442"));
        Country peru = new Country("Peru", new BigDecimal("1244242324"));
        Country brazil = new Country("Brazil", new BigDecimal("543453422"));
        Country cuba = new Country("Cuba", new BigDecimal("5445000"));
        Country chile = new Country("Chile", new BigDecimal("2455444"));
        Country mexico = new Country("Mexico", new BigDecimal("15162260"));

        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(poland);
        europeCountries.add(spain);
        europeCountries.add(france);
        europeCountries.add(austria);
        europeCountries.add(finland);
        europeCountries.add(sweden);
        europeCountries.add(italy);

        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(china);
        asiaCountries.add(india);
        asiaCountries.add(japan);
        asiaCountries.add(mongolia);

        List<Country> southAmericaCountries = new ArrayList<>();
        southAmericaCountries.add(argentina);
        southAmericaCountries.add(peru);
        southAmericaCountries.add(brazil);
        southAmericaCountries.add(chile);

        List<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(canada);
        northAmericaCountries.add(cuba);
        northAmericaCountries.add(mexico);

        Continent europeContinent = new Continent(europeCountries);
        Continent asiaContinent = new Continent(asiaCountries);
        Continent southAmericaContinent = new Continent(southAmericaCountries);
        Continent northAmericaContinent = new Continent(northAmericaCountries);

        List<Continent> continents = new ArrayList<>();
        continents.add(europeContinent);
        continents.add(asiaContinent);
        continents.add(southAmericaContinent);
        continents.add(northAmericaContinent);

        World world = new World(continents);

        //When
        BigDecimal population = world.getPeopleQuantity();

        //Then
        Assertions.assertEquals(new BigDecimal("9918454859550"), population);
    }
}