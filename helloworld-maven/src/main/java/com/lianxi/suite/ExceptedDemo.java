package com.lianxi.suite;

import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 22:07
 */
public class ExceptedDemo {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeFailed(){
        System.out.println("这是一个失败的异常测试！");
    }
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeFailed1(){
        System.out.println("这是一个成功的异常测试！");
        throw new RuntimeException();
    }
}
