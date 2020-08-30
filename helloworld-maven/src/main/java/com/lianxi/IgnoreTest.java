package com.lianxi;

import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 14:10
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 忽略测试1");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 忽略测试2");
    }
}
