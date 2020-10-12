package com.lenovo.javastudy.StringStudy;

import java.util.ArrayList;
import java.util.List;

/**
 * 无意识的递归
 * <p/>
 * Created by liuyu on 16/3/5.
 */
public class InfiniteRecursion {

    public String toString() {
        // 发生类型转换错误，并且递归调用toString方法
        return "InfiniteRecursion address:" + this + "\n";
        // 修复，赢使用Object.toString()
//        return "InfiniteRecursion address:" + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            v.add(new InfiniteRecursion());
            System.out.print(v);
        }
//        System.out.println("test");
    }
}

