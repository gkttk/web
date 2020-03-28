package com.myApp.api;

import com.myApp.User;

import java.util.Map;

public interface IUserService {
    void addUser(User user);
    boolean checkUserInMap(String userName);
    boolean checkUserLogPass(String userName, String password);
    Map<String, User> getUsers();
}
