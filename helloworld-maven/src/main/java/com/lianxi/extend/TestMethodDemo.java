package com.lianxi.extend;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-31 22:11
 */
public class TestMethodDemo {
    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaaa","aaaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("手动增加的日志。。。");
        throw new RuntimeException("运行时发生的异常...");
    }

}
