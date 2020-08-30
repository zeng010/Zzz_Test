package com.lianxi.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author: Zzz_tjhd
 * @date: 2020-08-30 22:32
 */
public class DataTest {

/*    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name="+name+",age="+age);
    }*/
/*    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }*/
    @Test(dataProvider = "method")
    public void test1(String name, int age){
        System.out.println("test1方法:name="+name+",age="+age);
    }
    @Test(dataProvider = "method")
    public void test2(String name, int age){
        System.out.println("test2方法:name="+name+",age="+age);
    }
    @DataProvider(name = "method")
    public Object[][] providerData(Method method){
        Object[][] o = null;
        if (method.getName().equals("test1")) {
            o = new Object[][]{
                    {"zhangsan",10},
                    {"lisi",20},
                    {"wangwu",30}
            };
        }else if(method.getName().equals("test2")){
            o = new Object[][]{
                    {"wangwu",10},
                    {"zhaoliu",20},
                    {"tianqi",30}
            };
        }
        return o;
    }
}
