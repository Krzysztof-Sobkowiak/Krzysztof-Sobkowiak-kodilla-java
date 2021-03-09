package com.kodilla.good.patterns.food.service;

import com.kodilla.good.patterns.food.user.User;

public class MailService implements InfoService {

    @Override
    public boolean informmation(final User user, boolean send) {

        if(send) {
            System.out.println("Dear " + user.getFirstName() + " " + user.getLastName());
            System.out.println("We send information about order to e-mail " + user.getUserContact().getMail() + " and phone " + user.getUserContact().getPhone());
            System.out.println("Shipping adress: " + user.getUserData().getStreet() + " "
                                                   + user.getUserData().getHouseNumber() + "/"
                                                   + user.getUserData().getApartmentNumber());
            System.out.println("City " + user.getUserData().getCity() + " code: " + user.getUserData().getCityCode());
            System.out.println();
        }

        return true;
    }
}
