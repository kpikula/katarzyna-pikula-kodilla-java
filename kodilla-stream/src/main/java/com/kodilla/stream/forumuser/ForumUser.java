package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public final class ForumUser {
    private final Integer uniqueID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;
    private final LocalDate now = LocalDate.now();


    public ForumUser(final Integer uniqueID, final String userName, final int year, final int month, final int day, final char sex, final int numberOfPosts) {
        this.uniqueID = uniqueID;
        this.userName = userName;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.sex = sex;
        this.numberOfPosts = numberOfPosts;


    }

    public int getAge() {
        final Period age = Period.between(dateOfBirth, now);
        return age.getYears();

    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser {" +
                "uniqueID: " + uniqueID +
                ", userName: '" + userName + '\'' +
                ", sex: " + sex +
                ", dateOfBirth: " + dateOfBirth +
                ", numberOfPosts: " + numberOfPosts +
                '}';
    }
}
