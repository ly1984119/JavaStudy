package com.lenovo.javastudy.Decorator;

/**
 * Created by liuyu on 2018/5/5.
 */
public class HeaderPrint extends OrderDecorator {

    public HeaderPrint(Order order) {
        super(order);
    }

    public void print() {
        this.headerPrint();
        super.order.print();
    }

    public void headerPrint() {
        System.out.println("HeaderPrint class print");
    }
}
