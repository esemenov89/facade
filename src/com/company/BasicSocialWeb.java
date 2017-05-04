package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 04.05.2017.
 */
public class BasicSocialWeb implements SocialWeb {

    private DB postgreDB = new PostgreDB();

    List<String> friends = new ArrayList<String>();
    {
        friends.add("Alexey");
        friends.add("Artem");
        friends.add("Nicolay");
    }

    private int money = 0;

    private List<String> notifications = Arrays.asList("notification1","notification2","notification3");

    @Override
    public List<String> getFriends() {
        return postgreDB.getListOfFriends();
    }

    @Override
    public void pay(int value) {
        money+=postgreDB.getMoney()+ value;
    }

    @Override
    public List<String> wall() {
        return postgreDB.getWall();
    }
}
