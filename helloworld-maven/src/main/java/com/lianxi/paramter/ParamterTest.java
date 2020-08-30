package com.lianxi.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 22:20
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void parmterTest1(String name, String age) {
        System.out.println("name:" + name + "age:" + age);
    }
}
