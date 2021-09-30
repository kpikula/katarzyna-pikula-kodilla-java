package com.kodilla.testing.weather.stub;

import java.util.*;

import static java.util.Arrays.*;

public class WeatherForecast {
    private Temperatures temperatures;
    private double mean;
    private double sum;
    private double median;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;

    }

    public double calculateMean() {
        Map<String, Double> resultMap1 = new HashMap<>();

        for (Map.Entry<String, Double> entry : temperatures.getTemperatures().entrySet()) {
            resultMap1.put(entry.getKey(), entry.getValue());
            sum = 0.0;
            int size = resultMap1.size();
            for (int i = 0; i < size; i++) {
                sum += entry.getValue();
            }
        }
        return sum / resultMap1.size();
    }

    public double calculateMedian() {
        ArrayList<Double> values = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(values);

        double median;
        int size = values.size();


        if (size % 2 == 0) {
            double sumOfMiddleElements = values.get(size / 2) + values.get(size / 2 - 1);
            median = ((double) sumOfMiddleElements) / 2;
        } else {
            median = (double) values.get(size / 2);
        }
        return median;
    }


}









