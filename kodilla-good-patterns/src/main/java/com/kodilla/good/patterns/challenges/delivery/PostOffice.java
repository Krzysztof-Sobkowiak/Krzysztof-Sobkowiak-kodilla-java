package com.kodilla.good.patterns.challenges.delivery;

import com.kodilla.good.patterns.challenges.service.DeliveryService;
import com.kodilla.good.patterns.challenges.user.User;

import static com.kodilla.good.patterns.challenges.delivery.ShippingDetails.shippingDetails;

public class PostOffice implements DeliveryService {

    public boolean deliveryTo(final User user, boolean sendMessage, boolean paracel, boolean post, boolean courier) {

        if(sendMessage && post && !courier && !paracel) {
            System.out.println("=== Order Shipping Information ===");
            System.out.println("We send information with the order to e-mail and telephone");
            System.out.println();

            System.out.println("=== Post Office ===");
            shippingDetails(user);
        }

        return true;
    }
}
