package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class TxtOrderRepository implements OrderRepository {

    @Override
    public boolean createOrder(User user, LocalDateTime orderDate) {
        return false;
    }
}
