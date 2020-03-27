package com.myApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    @Test
    public void testCheckLogPass(){
        Assertions.assertTrue(UserService.checkUserLogPass("admin", "admin"));

    }
}
