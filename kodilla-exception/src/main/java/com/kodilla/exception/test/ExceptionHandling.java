package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            String result = secondChallenge.probablyIWillThrowException(1, 1);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("This is a probable exception");
        } finally {
            System.out.println("Have a nice day");
        }

    }
}
