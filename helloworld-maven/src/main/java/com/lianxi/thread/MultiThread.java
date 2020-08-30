package com.lianxi.thread;

import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 22:59
 */
public class MultiThread {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1(){
        System.out.println(1);
        System.out.println("线程id为："+Thread.currentThread().getId());
    }
}
