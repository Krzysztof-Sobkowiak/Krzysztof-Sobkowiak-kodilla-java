package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.order.Order;

public interface PaymentService {

    boolean payment(final Order order, boolean paid);

}
