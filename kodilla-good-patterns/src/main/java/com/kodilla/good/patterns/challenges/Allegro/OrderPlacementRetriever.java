package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderPlacementRetriever {
    public OrderPlacement retrieve() {
        User user = new User("Marek", "Nowak", 898876, "48501998877", "m.nowak@wp.pl");
        LocalDateTime orderDate = LocalDateTime.of(2021, 11, 13, 17, 58);

        return new OrderPlacement(user, orderDate);
    }
}
