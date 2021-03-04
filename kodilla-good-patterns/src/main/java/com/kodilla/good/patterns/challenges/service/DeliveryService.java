package com.kodilla.good.patterns.challenges.service;

import com.kodilla.good.patterns.challenges.user.User;

public interface DeliveryService {

    boolean deliveryTo(final User user, boolean sendMessage, boolean paracel, boolean post, boolean courier);

}
