package com.lianxi.thread;

import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 23:08
 */
public class MultiThreadXML {
    @Test
    public void test1(){
        System.out.println(1);
        System.out.println("线程id为："+Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.println(1);
        System.out.println("线程id为："+Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.println(1);
        System.out.println("线程id为："+Thread.currentThread().getId());
    }
}
