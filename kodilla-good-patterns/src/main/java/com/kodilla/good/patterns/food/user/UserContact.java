package com.kodilla.good.patterns.food.user;

public class UserContact {

    private String phone;
    private String mail;

    public UserContact(String phone, String mail) {
        this.phone = phone;
        this.mail = mail;
    }

    public String getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }
}
