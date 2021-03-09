package com.kodilla.good.patterns.food.user;

public class User {
    private String firstName;
    private String lastName;
    private UserContact userContact;
    private UserData userData;

    public User(String firstName, String lastName, UserContact userContact, UserData userData) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userContact = userContact;
        this.userData = userData;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserContact getUserContact() {
        return userContact;
    }

    public UserData getUserData() {
        return userData;
    }
}
