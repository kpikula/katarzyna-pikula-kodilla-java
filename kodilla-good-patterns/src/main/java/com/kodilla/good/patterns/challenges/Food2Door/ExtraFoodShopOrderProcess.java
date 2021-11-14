package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class ExtraFoodShopOrderProcess implements OrderProcess {

    @Override
    public void process() {
        System.out.println("Thank you for ordering in our Extra Food Shop. Your order is being completed.");
    }
}
