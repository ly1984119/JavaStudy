package com.lenovo.javastudy.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by liuyu7 on 2019/1/11.
 */
public class Test {

    public static void main(String[] args) {
        Callable<String> a = new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(100);
                SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS");
                String xxx = Thread.currentThread().getName() + " " + format.format(new Date());
                return xxx;
            }
        };

        FutureTask<String> task1 = new FutureTask<>(a);
        FutureTask<String> task2 = new FutureTask<>(a);
        FutureTask<String> task3 = new FutureTask<>(a);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        Thread.currentThread().setName("李存勖部队——>");// 设置父线程名

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            Thread.sleep(1000);
            if (task1.isDone()) {
                System.out.println(task1.get());
            }
            if (task2.isDone()) {
                System.out.println(task2.get());
            }
            if (task3.isDone()) {
                System.out.println(task3.get());
            }
//            System.out.println(task1.get());
//            System.out.println(task2.get());
//            System.out.println(task3.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
