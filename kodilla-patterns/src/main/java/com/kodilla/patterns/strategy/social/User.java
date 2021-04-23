package com.kodilla.patterns.strategy.social;

public class User {

    private final String userName;
    protected SocialPublisher socialPublisher;

    public User(final String userName) {
        this.userName = userName;
    }

    public SocialPublisher getSocialPublisher() {
        return socialPublisher;
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }

    public String getUserName() {
        return userName;
    }

    public String sharePost() {
        return socialPublisher.share();
    }

}