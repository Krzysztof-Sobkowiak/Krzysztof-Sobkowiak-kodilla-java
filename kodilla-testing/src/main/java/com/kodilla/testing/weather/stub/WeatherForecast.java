package com.kodilla.testing.weather.stub;
import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }

        return resultMap;
    }

    public double calculateAverageTemperatures() {
        double sumTemperatures = 0.0;
        double averageTemperatures;

        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sumTemperatures += temperature.getValue();
        }

        averageTemperatures = sumTemperatures / temperatures.getTemperatures().size();

        return averageTemperatures;
    }

    public double calculateMedianTemperatures() {
        double medianTemperatures;

        List<Double> temperaturesOfList = new ArrayList<>();
        for(Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            temperaturesOfList.add(temperature.getValue());
        }

        Collections.sort(temperaturesOfList);
        if (temperaturesOfList.size() % 2 == 0) {
            double toMedianOne = temperaturesOfList.get(temperaturesOfList.size() / 2);
            double toMedianTwo = temperaturesOfList.get((temperaturesOfList.size() / 2) - 1);
            medianTemperatures = (toMedianOne + toMedianTwo) / 2;

            return medianTemperatures;
        }

        return temperaturesOfList.get(temperaturesOfList.size() / 2);
    }
}