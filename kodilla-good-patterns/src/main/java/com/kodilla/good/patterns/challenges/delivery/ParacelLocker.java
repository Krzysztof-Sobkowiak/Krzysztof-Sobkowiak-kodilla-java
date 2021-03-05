package com.kodilla.good.patterns.challenges.delivery;

import com.kodilla.good.patterns.challenges.service.DeliveryService;
import com.kodilla.good.patterns.challenges.user.User;

import static com.kodilla.good.patterns.challenges.delivery.ShippingDetails.shippingDetails;

public class ParacelLocker implements DeliveryService {

    public boolean deliveryTo(final User user, boolean sendMessage,boolean paracel,boolean post, boolean courier) {
        if(sendMessage) {
            System.out.println("=== Paracel Locker Shipping Information ===");
            System.out.println("We send information with the order to e-mail and telephone");

            return true;
        }

        if(paracel && !post && !courier) {
            System.out.println("=== Paracel Locker ===");
            shippingDetails(user);
        }
        return true;
    }
}
