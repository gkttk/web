package com.myApp;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void testCheckLogPass(){
        Assertions.assertTrue(UserService.checkUserLogPass("admin", "admin"));
    }

    @Test
    public void testCheckUserInMap(){
        Assertions.assertTrue(UserService.checkUserInMap("admin"));
    }

    @Test
    public void testAddUser(){
        UserService.addUser(new User("test", "test"));
        Assertions.assertEquals(2, UserService.getUsers().size());
    }

    @AfterAll
    public void deleteTest(){
        UserService.getUsers().remove("test");
    }
}
