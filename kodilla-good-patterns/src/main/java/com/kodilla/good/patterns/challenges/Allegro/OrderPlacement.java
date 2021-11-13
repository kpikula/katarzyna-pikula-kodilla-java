package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderPlacement {
    private User user;
    private LocalDateTime orderDate;

    public OrderPlacement(final User user, final LocalDateTime orderDate) {
        this.user = user;
        this.orderDate = orderDate;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order placement: " +
                user +
                ", Order date " + orderDate;
    }
}
