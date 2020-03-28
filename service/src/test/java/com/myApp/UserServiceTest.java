package com.myApp;

import com.myApp.api.IUserService;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserServiceTest {
    private static IUserService iUserService;

    @BeforeAll
    public static void createInstance(){
        iUserService = UserService.getInstance();
    }

    @Test
    public void testCheckLogPass(){
        Assertions.assertTrue(iUserService.checkUserLogPass("admin", "admin"));
    }

    @Test
    public void testCheckUserInMap(){
        Assertions.assertTrue(iUserService.checkUserInMap("admin"));
    }

    @Test
    public void testAddUser(){
        iUserService.addUser(new User("test", "test"));
        Assertions.assertEquals(2, iUserService.getUsers().size());

    }

    @AfterAll
    public static void deleteTest(){
        iUserService.getUsers().remove("test");
    }
}
