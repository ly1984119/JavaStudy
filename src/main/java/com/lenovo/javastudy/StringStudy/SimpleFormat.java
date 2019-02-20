package com.lenovo.javastudy.StringStudy;

/**
 * 格式化输出
 * <p/>
 * Created by liuyu on 16/3/5.
 */
public class SimpleFormat {

    public static void main(String[] args) {
        int x = 5;
        double y = 5.33423;

        System.out.println("Row 1:[" + x + " " + y + "]");
        System.out.format("Row 1:[%d %f]\n", x, y);
        System.out.printf("Row 1:[%d %f]\n", x, y);
    }
}
