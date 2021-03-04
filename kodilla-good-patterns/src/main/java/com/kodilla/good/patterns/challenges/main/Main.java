package com.kodilla.good.patterns.challenges.main;

import com.kodilla.good.patterns.challenges.delivery.ParacelLocker;
import com.kodilla.good.patterns.challenges.delivery.PostOffice;
import com.kodilla.good.patterns.challenges.order.CustomerOrder;
import com.kodilla.good.patterns.challenges.order.Order;
import com.kodilla.good.patterns.challenges.order.OrderProcess;
import com.kodilla.good.patterns.challenges.order.BankService;
import com.kodilla.good.patterns.challenges.order.ProductOrderService;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();
        CustomerOrder customerOrder = order.shoppingCart();

        OrderProcess orderProcess = new OrderProcess(new ProductOrderService(), new ParacelLocker(),new BankService());
        orderProcess.shippingTo(customerOrder);

    }
}
