package com.kodilla.testing.weather.stub;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeatherForecastTestSuite {
    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub(); ///interfejs tworzy matryce z klasy Temperaturestub
        WeatherForecast weatherForecast = new WeatherForecast(temperatures); //Matryca pobiera wartosc z interfejsu i klasy TemperaturesStub

        //When
        int quantityOfSensor = weatherForecast.calculateForecast().size(); //czujniki i wielkoosc

        //Then
        Assertions.assertEquals(5, quantityOfSensor); //ilosc czujnikow porownanie
    }
}
