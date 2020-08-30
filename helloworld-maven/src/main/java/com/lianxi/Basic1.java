package com.lianxi;

import org.testng.annotations.*;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-28 14:51
 */
public class Basic1 {

    @Test
    public void testCase1(){
        System.out.println("这是第一个测试用例！");
    }

    @Test
    public void testCase2(){
        System.out.println("这是第二个测试用例！");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是之前运行的测试用例1");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是在测试用例之后运行的用例！");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("这是类之前运行的class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("这是类之后运行的class");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite测试套件");
    }
}
