package com.lianxi.groups;

import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 14:58
 */
@Test(groups = "teacher")
public class GroupsClass3 {
    public void teacher1(){
        System.out.println("GroupsClass3333中的teacher1运行");
    }
    public void teacher2(){
        System.out.println("GroupsClass3333中的teacher2运行");
    }
}
