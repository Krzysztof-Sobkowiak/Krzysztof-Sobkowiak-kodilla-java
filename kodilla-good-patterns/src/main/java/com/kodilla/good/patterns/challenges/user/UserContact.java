package com.kodilla.good.patterns.challenges.user;

public class UserContact {

    private String phoneNumber;
    private String mail;

    public UserContact(String phoneNumber, String mail) {
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMail() {
        return mail;
    }
}
