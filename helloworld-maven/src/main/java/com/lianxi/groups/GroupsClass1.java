package com.lianxi.groups;

import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 14:58
 */
@Test(groups = "stu")
public class GroupsClass1 {
    public void stu1(){
        System.out.println("GroupsClass1111中的stu1运行");
    }
    public void stu2(){
        System.out.println("GroupsClass11111中的stu2运行");
    }
}
