package com.kodilla.good.patterns.challenges.delivery;

import com.kodilla.good.patterns.challenges.user.User;

public class ShippingDetails {

    public static void shippingDetails(User user) {
        System.out.println("Shipping order to: " + user.getFirstName() + " " + user.getLastName());
        System.out.println("Nick: " + user.getNick());
        System.out.println("E-mail: " + user.getUserContact().getMail());
        System.out.println("Phone Number : " + user.getUserContact().getPhoneNumber());

        System.out.println("Adress: " + user.getUserData().getStreet() + " "
                + user.getUserData().getHouseNumber() + " / "
                + user.getUserData().getApartmentNumber());

        System.out.println("City: " + user.getUserData().getCity());
        System.out.println("City code: " + user.getUserData().getCityCode());
        System.out.println();
    }
}
