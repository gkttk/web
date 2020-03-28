package com.myApp;

import com.myApp.api.IUserDao;
import com.myApp.api.IUserService;
import java.util.Map;

public class UserService implements IUserService {
    private IUserDao iUserDao = UserDao.getInstance();
    private static volatile IUserService instance;

    private UserService() {}

    public static IUserService getInstance() {
        IUserService localIUserService = instance;
        if (localIUserService == null) {
            synchronized (IUserService.class) {
                instance = localIUserService = new UserService();
            }
        }
        return instance;
    }

    public Map<String, User> getUsers() {
        return iUserDao.getUsers();
    }

    @Override
    public void addUser(User user) {
        iUserDao.addUser(user);
    }

    @Override
    public boolean checkUserInMap(String userName) {
        for (String u : iUserDao.getUsers().keySet()) {
            if (u.equalsIgnoreCase(userName)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkUserLogPass(String userName, String password) {
        if (checkUserInMap(userName)) {
            if (iUserDao.getUsers().get(userName).getPassword().equalsIgnoreCase(password)) {
                return true;
            }
        }
        return false;
    }


}
