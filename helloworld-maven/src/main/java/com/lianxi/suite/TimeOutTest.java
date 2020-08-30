package com.lianxi.suite;

import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 23:27
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess() throws Exception{
        Thread.sleep(4000);
        System.out.println("测试成功。。。");
    }
}
