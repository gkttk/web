package com.myApp.api;

import com.myApp.User;
import java.util.Map;

public interface IUserDao {
    Map<String, User> getUsers();
    void addUser(User user);
}
