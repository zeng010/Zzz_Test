package com.lianxi.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 13:39
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite 运行了！");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite 运行了!");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("BeforeTest 运行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("AfterTest 运行了");
    }
}
