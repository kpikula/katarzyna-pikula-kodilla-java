package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderService {
    private OrderProcess orderProcess;

    public ProductOrderService(OrderProcess orderProcess) {
        this.orderProcess = orderProcess;
    }

    public void orderProcessing(final OrderPlacement orderPlacement) {
        orderProcess.process();
    }
}
