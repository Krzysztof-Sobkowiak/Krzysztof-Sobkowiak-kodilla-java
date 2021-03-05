package com.kodilla.good.patterns.challenges.order;

import com.kodilla.good.patterns.challenges.user.User;

public class CustomerOrder {

    private User user;
    private Facture facture;;

    public CustomerOrder(final User user, final Facture facture) {
        this.user = user;
        this.facture = facture;
    }

    public User getUser() {
        return user;
    }

    public Facture getFacture() {
        return facture;
    }

}
