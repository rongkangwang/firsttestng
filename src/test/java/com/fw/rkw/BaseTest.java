package com.fw.rkw;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("I am in Before Method! Test is starting!");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("I am in After Method! Test is ending!");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("I am in Before Test!");
    }
}
