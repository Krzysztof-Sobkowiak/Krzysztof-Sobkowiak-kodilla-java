package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser{
    private final int userID;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int postQuantity;


    public ForumUser(final int userID, final String userName, final char sex, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, final int postQuantity) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.postQuantity = postQuantity;
    }

    public int getUserID(){
        return userID;
    }

    public String getUserName(){
        return userName;
    }

    public char getSex(){
        return sex;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public int getPostQuantity(){
        return postQuantity;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(! (o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if(getUserID() != forumUser.getUserID()) return false;
        if(getSex() != forumUser.getSex()) return false;
        if(getPostQuantity() != forumUser.getPostQuantity()) return false;
        if(! getUserName().equals(forumUser.getUserName())) return false;
        return getBirthDate().equals(forumUser.getBirthDate());
    }

    @Override
    public int hashCode(){
        int result = getUserID();
        result = 31 * result + getUserName().hashCode();
        result = 31 * result + (int) getSex();
        result = 31 * result + getBirthDate().hashCode();
        result = 31 * result + getPostQuantity();
        return result;
    }

    @Override
    public String toString(){
        return "ForumUser{" + "userID=" + userID + ", userName='" + userName + '\'' + ", sex=" + sex + ", birthDate=" + birthDate + ", postQuantity=" + postQuantity + '}';
    }
}

