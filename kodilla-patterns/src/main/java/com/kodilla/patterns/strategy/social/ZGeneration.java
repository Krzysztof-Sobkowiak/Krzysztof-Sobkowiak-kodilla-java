package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;

public class ZGeneration extends User {

    public ZGeneration(String userName) {
        super(userName);
        this.socialPublisher = new TwitterPublisher();
    }
}