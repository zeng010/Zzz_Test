package com.lianxi.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 14:45
 */
public class GroupsOnMethod {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法3");
    }

    @BeforeGroups("server")
    public void beforeServer(){
        System.out.println("这是服务端组运行之前的运行的方法！");
    }

    @AfterGroups("server")
    public void afterServer(){
        System.out.println("这是服务端端组运行之后的运行的方法！");
    }
}
