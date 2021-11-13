package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                          final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderPlacement orderPlacement) {
        boolean isOrdered = orderService.order(orderPlacement.getUser(), orderPlacement.getOrderDate());

        if (isOrdered) {
            informationService.notify(orderPlacement.getUser());
            orderRepository.createOrder(orderPlacement.getUser(), orderPlacement.getOrderDate());
            return new OrderDto(orderPlacement.getUser(), true);
        } else {
            return new OrderDto(orderPlacement.getUser(), false);
        }
    }
}
