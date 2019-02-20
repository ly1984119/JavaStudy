package com.lenovo.javastudy.annotation;

/**
 * Created by liuyu7 on 2019/1/28.
 */
public class TestService {

    @TestMethodZJ(value = true)
    public static void runFirst(@TestMethodParaZJ int value) {
        System.out.println("TestService runFirst!" + value);
    }
}
