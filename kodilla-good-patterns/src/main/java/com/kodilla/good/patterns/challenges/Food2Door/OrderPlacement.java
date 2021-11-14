package com.kodilla.good.patterns.challenges.Food2Door;


import java.time.LocalDateTime;

public class OrderPlacement {
    private Product product;
    private Supplier supplier;

    public OrderPlacement(Product product, Supplier supplier) {
        this.product = product;
        this.supplier = supplier;
    }

    public Product getProduct() {
        return product;
    }


    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public String toString() {
        return "Order placement: " +
                "product " + product +
                ", supplier " + supplier;
    }
}
