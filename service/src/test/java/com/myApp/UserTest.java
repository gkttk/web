package com.myApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class UserTest {
    private static User user;
    @BeforeAll
    public static void createUser(){
        user = new User("test", "test");
    }

    @Test
    public void testToString(){
        Assertions.assertEquals("test", user.getLogin());
    }
}
