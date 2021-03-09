package com.kodilla.good.patterns.food.service;

import com.kodilla.good.patterns.food.order.CustomerOrder;
import com.kodilla.good.patterns.food.order.Shipping;

public class ProductOrderService {

    private InfoService infoService;
    private ProducerService producerService;

    public ProductOrderService(InfoService infoService, ProducerService producerService) {
        this.infoService = infoService;
        this.producerService = producerService;

    }

    public Shipping shippingTo(CustomerOrder customerOrder) {
        boolean send = infoService.informmation(customerOrder.getUser(), true);
        boolean order = producerService.process();
        if(order) {


            System.out.println("Thank you for choising our store.\n"
                             + "We will try to deliver them as soon as posible");
            System.out.println("Gretings and have a nice day.");
            System.out.println("------------------------------------------------\n");
        } else {
            System.out.println("We waiting for a confirmed payment");
        }
        return new Shipping(customerOrder.getUser());

    }
}
