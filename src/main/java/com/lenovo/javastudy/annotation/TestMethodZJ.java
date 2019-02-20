package com.lenovo.javastudy.annotation;

import java.lang.annotation.*;

/**
 * Created by liuyu7 on 2019/1/28.
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)  // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target({ElementType.FIELD,ElementType.METHOD}) // 属性和方法，添加多个要有大括号
public @interface TestMethodZJ {

 boolean value();

}
