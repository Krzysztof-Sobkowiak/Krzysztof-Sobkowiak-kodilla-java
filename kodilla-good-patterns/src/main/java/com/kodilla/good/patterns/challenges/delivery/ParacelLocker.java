package com.kodilla.good.patterns.challenges.delivery;

import com.kodilla.good.patterns.challenges.service.DeliveryService;
import com.kodilla.good.patterns.challenges.user.User;

public class ParacelLocker implements DeliveryService {

    public boolean deliveryTo(final User user, boolean sendMessage,boolean paracel,boolean post, boolean courier) {
        if(sendMessage && paracel && !post && !courier) {
            System.out.println("=== Paracel Locker ===");
            System.out.println("We send information with the order to e-mail and telephone");
            System.out.println("Shipping order to: " + user.getFirstName() + " " + user.getLastName());
            System.out.println("Nick: " + user.getNick());
            System.out.println("E-mail: " + user.getUserContact().getMail());
            System.out.println("Phone Number: " + user.getUserContact().getPhoneNumber());

            System.out.println("Adress: " + user.getUserData().getStreet() + " " + user.getUserData().getHouseNumber() + " / " + user.getUserData().getApartmentNumber());

            System.out.println("City: " + user.getUserData().getCity());
            System.out.println("City code: " + user.getUserData().getCityCode());
            System.out.println();
        }

        return true;
    }
}
