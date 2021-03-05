package com.kodilla.good.patterns.challenges.order;

import com.kodilla.good.patterns.challenges.service.OrderService;
import com.kodilla.good.patterns.challenges.user.User;

public class OrderProcess implements OrderService {

    public boolean productOrder(final User user, final Order order) {
        System.out.println("==== Order Status ====");
        System.out.println("Name: " + user.getFirstName() + " " +
                user.getLastName());

        return true;
    }
}