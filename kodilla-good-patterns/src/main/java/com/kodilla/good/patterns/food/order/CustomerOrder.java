package com.kodilla.good.patterns.food.order;

import com.kodilla.good.patterns.food.user.User;

public class CustomerOrder {
    private User user;

    public CustomerOrder(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
