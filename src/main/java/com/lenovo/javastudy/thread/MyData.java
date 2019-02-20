package com.lenovo.javastudy.thread;

/**
 * Created by liuyu7 on 2019/1/14.
 */
public class MyData {

    private int curentValue = 0; // 0未使用，1占用
    private static MyData myData = new MyData();

    private MyData(){

    }

    public int getCurentValue() {
        return curentValue;
    }

    public void setCurentValue(int curentValue) {
        this.curentValue = curentValue;
    }

    public static MyData getMyData() {
        return myData;
    }
}
