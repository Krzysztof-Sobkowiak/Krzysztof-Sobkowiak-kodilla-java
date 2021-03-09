package com.kodilla.good.patterns.food.main;

import com.kodilla.good.patterns.food.order.CustomerOrder;
import com.kodilla.good.patterns.food.order.Order;
import com.kodilla.good.patterns.food.producer.ExtraFoodShop;
import com.kodilla.good.patterns.food.producer.GlutenFreeShop;
import com.kodilla.good.patterns.food.producer.HealthyShop;
import com.kodilla.good.patterns.food.service.MailService;
import com.kodilla.good.patterns.food.service.ProductOrderService;

public class Main {

    public static void main(String[] args) {

        Order order = new Order();

        CustomerOrder customerOrder = order.shoppingCartGlutenFree();
        ProductOrderService process = new ProductOrderService(new MailService(), new GlutenFreeShop());
        process.shippingTo(customerOrder);

        CustomerOrder customerOrder1 = order.shoppingCartHealthy();
        ProductOrderService process1 = new ProductOrderService(new MailService(), new HealthyShop());
        process1.shippingTo(customerOrder1);

        CustomerOrder customerOrder2 = order.shoppingCartExtra();
        ProductOrderService process2 = new ProductOrderService(new MailService(), new ExtraFoodShop());
        process2.shippingTo(customerOrder2);

    }
}