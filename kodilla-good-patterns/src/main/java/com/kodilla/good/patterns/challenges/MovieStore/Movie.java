package com.kodilla.good.patterns.challenges.MovieStore;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private final List<Movie> movieList = new ArrayList<Movie>();
    private final String movieTitle;


    public Movie(final String movieTitle) {
        this.movieTitle = movieTitle;
    }


    public String getMovieTitle() {
        return movieTitle;
    }


    @Override
    public String toString() {
        return movieTitle + "!";
    }
}
