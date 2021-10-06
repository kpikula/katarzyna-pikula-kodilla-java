package com.kodilla.stream.array;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {
        return IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .map(k -> {
                    System.out.println(k);
                    return k;
                })
                .average().getAsDouble();
    }
}
