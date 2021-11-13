package com.kodilla.good.patterns.challenges.MovieStore;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookTitle {
    private final Map<String, List<Movie>> booksTitlesWithTranslations = new HashMap<>();
    private final String bookTitle;

    public BookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    @Override
    public String toString() {
        return getBookTitle() + "";
    }
}
