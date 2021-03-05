package com.kodilla.good.patterns.challenges.main;

import com.kodilla.good.patterns.challenges.delivery.ParacelLocker;
import com.kodilla.good.patterns.challenges.order.*;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        CustomerOrder customerOrder = order.shoppingCart();

        ProductOrderService process = new ProductOrderService(new OrderProcess(), new ParacelLocker(),new BankService());
        process.shippingTo(customerOrder);

    }
}
