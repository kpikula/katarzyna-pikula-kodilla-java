package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final List<String> movieList = new ArrayList<>();
    private final String movieTitle;

    public Movie(String movie) {
        this.movieTitle = movie;
    }

    @Override
    public String toString() {
        return movieTitle + "!";
    }
}
