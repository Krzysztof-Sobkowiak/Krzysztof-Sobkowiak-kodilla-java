package com.kodilla.good.patterns.food.order;

import com.kodilla.good.patterns.food.user.User;

public class Shipping {
    private User user;

    public Shipping(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
