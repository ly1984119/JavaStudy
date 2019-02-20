package com.lenovo.javastudy.annotation;

import java.lang.reflect.*;

/**
 * Created by liuyu7 on 2019/1/28.
 */
public class MyMain {

    public static void main(String[] args) {
        TestService service = new TestService();
        Method[] methods = TestService.class.getMethods(); // 获取所有方法
        Field[] fields = TestService.class.getDeclaredFields(); // 获取所有属性

        for (Method item : methods) {
            if (item.isAnnotationPresent(TestMethodZJ.class)) {
                TestMethodZJ methodZJ = item.getAnnotation(TestMethodZJ.class);
                System.out.println("Method" + item.getName() + ",has annotation!");
                if (methodZJ.value()) {
                    try {
                        Parameter[] parameters = item.getParameters(); // 获取方法的所有参数
                        int value = 60;
                        for (Parameter para : parameters) {
                            TestMethodParaZJ methodParaZJ = para.getAnnotation(TestMethodParaZJ.class);
                            if (para.isAnnotationPresent(TestMethodParaZJ.class)) {
                                if (value > methodParaZJ.value()) {
                                    value = methodParaZJ.value();
                                }
                            }
                        }
                        item.invoke(service, value);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
