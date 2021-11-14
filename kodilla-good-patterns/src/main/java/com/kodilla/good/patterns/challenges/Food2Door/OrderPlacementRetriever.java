package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderPlacementRetriever {
    public OrderPlacement retrieve() {
        Supplier supplier = new Supplier("Extra Food Shop");
        Product product = new Product("Protein bar", 2);
        return new OrderPlacement(product, supplier);
    }
}
