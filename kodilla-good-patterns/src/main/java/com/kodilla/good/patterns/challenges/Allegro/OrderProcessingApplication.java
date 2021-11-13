package com.kodilla.good.patterns.challenges.Allegro;

import java.time.LocalDateTime;

public class OrderProcessingApplication {
    public static void main(String[] args) {
        OrderPlacementRetriever orderPlacementRetriever = new OrderPlacementRetriever();
        OrderPlacement orderPlacement = orderPlacementRetriever.retrieve();

        ProductOrderService orderService = new ProductOrderService(new MailService(), new ClothesOrderService(), new TxtOrderRepository());
        orderService.process(orderPlacement);
        System.out.println(orderPlacement);
    }
}
