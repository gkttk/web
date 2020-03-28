package com.myApp;

import com.myApp.api.IUserDao;
import java.util.HashMap;
import java.util.Map;

public class UserDao implements IUserDao {
    private static volatile IUserDao instance;
    private static Map<String, User> users;

    static {
        getInstance().addUser(new User("admin", "admin"));
    }

    private UserDao() {
        users = new HashMap<>();
    }


    public static IUserDao getInstance() {
        IUserDao localUserDao = instance;
        if (localUserDao == null) {
            synchronized (UserDao.class) {
                instance = localUserDao = new UserDao();
            }
        }
        return instance;
    }

    @Override
    public Map<String, User> getUsers() {
        return users;
    }

    @Override
    public void addUser(User user) {
        users.put(user.getLogin(), user);
    }
}
