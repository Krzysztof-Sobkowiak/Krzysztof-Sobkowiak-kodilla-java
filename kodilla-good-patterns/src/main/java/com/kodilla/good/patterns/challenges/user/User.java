package com.kodilla.good.patterns.challenges.user;

import com.kodilla.good.patterns.challenges.user.UserContact;
import com.kodilla.good.patterns.challenges.user.UserData;

public class User {
    private String nick;
    private String firstName;
    private String lastName;
    private UserData userData;
    private UserContact userContact;

    public User(String nick, String firstName, String lastName, UserData userData, UserContact userContact) {
        this.nick = nick;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userData = userData;
        this.userContact = userContact;
    }

    public String getNick() {
        return nick;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public UserData getUserData() {
        return userData;
    }

    public UserContact getUserContact() {
        return userContact;
    }

}
