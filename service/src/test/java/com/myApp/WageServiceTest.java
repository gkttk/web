package com.myApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class WageServiceTest {

    private static WageService wageService;

    @BeforeAll
    public static void createInstance(){
        wageService = WageService.getInstance();
    }


    @Test
    public void testVszn(){
        Assertions.assertEquals(35,wageService.vszn(100));
    }

    @Test
    public void testBelgoz(){
        Assertions.assertEquals(6,wageService.belgoz(1000));
    }

    @Test
    public void testPodohodnyi(){
        Assertions.assertEquals(13,wageService.podohodnyi(100));
    }

    @Test
    public void testProf(){
        Assertions.assertEquals(1,wageService.prof(100));
    }

}
