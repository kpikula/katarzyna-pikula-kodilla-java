package com.kodilla.good.patterns.challenges;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class MovieStore {
    static private String ZELAZNYCZLOWIEK_IRONMANTRANSLATIONS = "Żelazny Człowiek";
    static private String IRONMAN_IRONMANTRANSLATIONS = "Iron Man";
    static private String MSCICIELE_AVENGERSTRANSLATIONS = "Mściciele";
    static private String AVENGERS_AVENGERSTRANSLATIONS = "Avengers";
    static private String BLYSKAWICA_FLASHTRANSLATIONS = "Błyskawica";
    static private String FLASH_FLASHTRANSLATIONS = "Flash";
    static private String IM_BOOKSTITLESWITHTRANSLATIONS = "IM";
    static private String AV_BOOKSTITLESWITHTRANSLATIONS = "AV";
    static private String FL_BOOKSTITLESWITHTRANSLATIONS = "FL";


    public static void getMovies() {
        final List<Movie> ironManTranslations = new ArrayList<>();
        ironManTranslations.add(new Movie(ZELAZNYCZLOWIEK_IRONMANTRANSLATIONS));
        ironManTranslations.add(new Movie(IRONMAN_IRONMANTRANSLATIONS));

        final List<Movie> avengersTranslations = new ArrayList<>();
        avengersTranslations.add(new Movie(MSCICIELE_AVENGERSTRANSLATIONS));
        avengersTranslations.add(new Movie(AVENGERS_AVENGERSTRANSLATIONS));

        final List<Movie> flashTranslations = new ArrayList<>();
        flashTranslations.add(new Movie(BLYSKAWICA_FLASHTRANSLATIONS));
        flashTranslations.add(new Movie(FLASH_FLASHTRANSLATIONS));

        final Map<BookTitle, List<Movie>> booksTitlesWithTranslations = new HashMap<>();
        booksTitlesWithTranslations.put(new BookTitle(IM_BOOKSTITLESWITHTRANSLATIONS), ironManTranslations);
        booksTitlesWithTranslations.put(new BookTitle(AV_BOOKSTITLESWITHTRANSLATIONS), avengersTranslations);
        booksTitlesWithTranslations.put(new BookTitle(FL_BOOKSTITLESWITHTRANSLATIONS), flashTranslations);


        String listOfBooks = booksTitlesWithTranslations.entrySet().stream()
                .flatMap(e -> e.getValue().stream())
                .map(Movie::getMovieTitle)
                .collect(Collectors.joining("!"));

        String listOfBooks2 = booksTitlesWithTranslations.keySet().stream()
                .map(m -> m.toString())
                .collect(Collectors.joining("!"));

        System.out.println(listOfBooks + listOfBooks2);

    }

    public static void main(String[] args) {
        MovieStore movieList = new MovieStore();
        movieList.getMovies();
    }
}


