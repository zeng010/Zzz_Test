package com.lianxi.suite;

import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 22:14
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run...");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run...");
    }
}
