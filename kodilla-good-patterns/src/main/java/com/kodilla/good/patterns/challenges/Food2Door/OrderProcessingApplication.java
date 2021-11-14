package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessingApplication {
    public static void main(String[] args) {
        OrderPlacementRetriever orderPlacementRetriever = new OrderPlacementRetriever();
        OrderPlacement orderPlacement = orderPlacementRetriever.retrieve();

        ProductOrderService orderService = new ProductOrderService(new ExtraFoodShopOrderProcess());
        orderService.orderProcessing(orderPlacement);
        System.out.println(orderPlacement);
    }
}
