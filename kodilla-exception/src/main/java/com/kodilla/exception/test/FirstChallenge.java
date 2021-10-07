package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     *
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);
            System.out.println("The result of your calculation is " + result);
        } catch (Exception e) {
            System.out.println("You cannot divide by zero. Try use another number as a divisor");
        } finally {
            System.out.println("Have a nice day");
        }
    }
}
