package com.kodilla.good.patterns.challenges.order;

import com.kodilla.good.patterns.challenges.user.User;

public class Shipping {

    private User user;

    public Shipping(final User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}
