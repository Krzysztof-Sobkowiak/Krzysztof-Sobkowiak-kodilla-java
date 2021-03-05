package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.order.Order;
import com.kodilla.good.patterns.challenges.user.User;

public interface OrderService {

    boolean productOrder(final User user, final Order order);

}
