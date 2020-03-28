package com.myApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WageServiceTest {

    @Test
    public void testVszn(){
        Assertions.assertEquals(35,WageService.vszn(100));
    }

    @Test
    public void testBelgoz(){
        Assertions.assertEquals(6,WageService.belgoz(1000));
    }

    @Test
    public void testPodohodnyi(){
        Assertions.assertEquals(13,WageService.podohodnyi(100));
    }

    @Test
    public void testProf(){
        Assertions.assertEquals(1,WageService.prof(100));
    }

}
