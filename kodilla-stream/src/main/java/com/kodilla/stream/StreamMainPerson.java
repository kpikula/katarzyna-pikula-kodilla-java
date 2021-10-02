package com.kodilla.stream;

import com.kodilla.stream.person.People;

import java.util.Locale;

public class StreamMainPerson {
    public static void main(String[] args) {
        People.getList().stream()
                .map(String::toUpperCase)                             // [1]
                .filter(s -> s.length() > 11)                         // [2]
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")   // [3]
                .filter(s -> s.substring(0, 1).equals("M"))           // [4]
                .forEach(System.out::println);                        // [5]
    }
}
