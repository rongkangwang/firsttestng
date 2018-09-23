package com.fw.rkw;

import org.testng.annotations.Test;

public class SampleTest extends BaseTest {
    @Test
    public void test1() {
        System.out.println("I am in test1 test method and it will pass.");
    }
    @Test(expectedExceptions=RuntimeException.class)
    public void test2(){
        System.out.println("I am in test2 test method and it will fail.");
        //throw new RuntimeException();
    }
}
