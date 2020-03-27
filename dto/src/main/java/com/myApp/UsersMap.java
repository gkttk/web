package com.myApp;

import java.util.HashMap;
import java.util.Map;

public class UsersMap {
    private static Map<String, User> users;

    public static Map<String,User> getInstance(){
        if(users == null){
         users = new HashMap<>();
        }
        return users;
    }

}
