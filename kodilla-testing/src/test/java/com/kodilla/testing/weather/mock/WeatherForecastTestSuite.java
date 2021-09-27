package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {
    @Mock
    private Temperatures temperaturesMock;

    @Test
    void testCalculateForecastWithMock() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @Test
    void testCalculateMean() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast meanTemperaturValue = new WeatherForecast(temperaturesMock);
        double expectedValue = 25.5;

        //When
        double meanOfTemperatures = meanTemperaturValue.calculateMean();

        //Then
        Assertions.assertEquals(expectedValue, meanOfTemperatures);
    }

    @Test
    void testCalculateMedian() {
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);
        temperaturesMap.put("Krakow", 26.2);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);
        WeatherForecast medianTemperatureValue = new WeatherForecast(temperaturesMock);
        double expectedValue = 25.2;

        //When
        double medianOfTemperatures = medianTemperatureValue.calculateMedian();

        //Then
        Assertions.assertEquals(expectedValue, medianOfTemperatures);
        System.out.println(medianOfTemperatures);
    }
}
