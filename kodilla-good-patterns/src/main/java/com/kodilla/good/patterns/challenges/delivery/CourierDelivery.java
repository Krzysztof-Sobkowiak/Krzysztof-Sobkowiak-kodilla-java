package com.kodilla.good.patterns.challenges.delivery;

import com.kodilla.good.patterns.challenges.service.DeliveryService;
import com.kodilla.good.patterns.challenges.user.User;

import static com.kodilla.good.patterns.challenges.delivery.ShippingDetails.shippingDetails;

public class CourierDelivery implements DeliveryService {

    public boolean deliveryTo(final User user, boolean sendMessage,boolean paracel,boolean post, boolean courier) {

        if(sendMessage && courier && !paracel && !post) {
            System.out.println("=== Courier Shipping Information ===");
            System.out.println("We send information with the order to e-mail and telephone");
            System.out.println();

            System.out.println("=== Courier Delivery ===");
            shippingDetails(user);
        }
        return true;
    }
}
