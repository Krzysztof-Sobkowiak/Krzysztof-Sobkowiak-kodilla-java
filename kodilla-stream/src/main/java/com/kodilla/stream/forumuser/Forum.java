package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;


public final class Forum{
    private final List<ForumUser> listOfForumUser = new ArrayList<>();

    public Forum(){
        listOfForumUser.add(new ForumUser(58874587, "Artur", 'M',1992,10,11,5));
        listOfForumUser.add(new ForumUser(12857778, "Magdalena", 'F',1994,1,1,51));
        listOfForumUser.add(new ForumUser(45455446, "Wioletta", 'F',1988,2,19,1085));
        listOfForumUser.add(new ForumUser(24345555, "Oskar", 'M',2000,4,22,1211));
        listOfForumUser.add(new ForumUser(78257777, "Jan", 'M',1955,3,19,223));
        listOfForumUser.add(new ForumUser(84527772, "Jacek", 'M',1997,2,9,1310));
        listOfForumUser.add(new ForumUser(12727200, "Mariusz", 'M',2004,4,16,1230));
        listOfForumUser.add(new ForumUser(87772045, "Ewa", 'F',2005,5,18,23));
        listOfForumUser.add(new ForumUser(27752278, "Natasza", 'F',2000,11,22,3));
        listOfForumUser.add(new ForumUser(10004727, "Natalia", 'F',1984,6,6,12));
        listOfForumUser.add(new ForumUser(58258704, "Justyna", 'F',1981,8,10,11));
        listOfForumUser.add(new ForumUser(24524522, "Krzysztof", 'M',1995,1,26,121));
        listOfForumUser.add(new ForumUser(55552404, "Dariusz", 'M',2010,12,20,1210));
        listOfForumUser.add(new ForumUser(99954244, "Andrzej", 'M',2011,5,6,1556));
        listOfForumUser.add(new ForumUser(40772488, "Bogdan", 'M',1944,8,10,15));
        listOfForumUser.add(new ForumUser(10270485, "Agata", 'F',2007,1,26,125));
        listOfForumUser.add(new ForumUser(10000033, "Katarzyna", 'F',2010,11, 1, 155));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(listOfForumUser);

    }
}