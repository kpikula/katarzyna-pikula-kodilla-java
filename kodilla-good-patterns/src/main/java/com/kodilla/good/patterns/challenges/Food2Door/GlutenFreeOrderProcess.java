package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class GlutenFreeOrderProcess implements OrderProcess {

    @Override
    public void process() {
        System.out.println("Thank you for ordering in our Free Gluten Shop. Your order is being completed.");
    }
}
