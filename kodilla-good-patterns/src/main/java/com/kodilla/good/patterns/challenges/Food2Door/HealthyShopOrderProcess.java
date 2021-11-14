package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class HealthyShopOrderProcess implements OrderProcess {

    @Override
    public void process() {
        System.out.println("Thank you for ordering in our Healthy Shop. Your order is being completed.");
    }
}
