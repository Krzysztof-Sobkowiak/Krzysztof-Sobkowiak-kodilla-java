package com.kodilla.good.patterns.challenges.order;

import com.kodilla.good.patterns.challenges.service.DeliveryService;
import com.kodilla.good.patterns.challenges.service.OrderService;
import com.kodilla.good.patterns.challenges.service.PaymentService;

public class ProductOrderService {

    private OrderService orderService;
    private DeliveryService deliveryService;
    private PaymentService paymentService;

    public ProductOrderService(OrderService orderService, DeliveryService deliveryService, PaymentService paymentService) {
        this.orderService = orderService;
        this.deliveryService = deliveryService;
        this.paymentService = paymentService;
    }

    public Shipping shippingTo(CustomerOrder customerOrder) {
        boolean ordered = orderService.productOrder(customerOrder.getUser(),customerOrder.getFacture());
        if (ordered) {
            paymentService.payment(customerOrder.getFacture(),true);
            deliveryService.deliveryTo(customerOrder.getUser(),true,true,false,false);
        } else {
            System.out.println("Make a payment for the service to be performed");
        }
        return new Shipping(customerOrder.getUser());
    }
}
