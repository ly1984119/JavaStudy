package com.lenovo.javastudy.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class MyTest {

    public static void main(String[] args) {

        final MyController controller = new MyController();

        // 模拟不同动作操作同一个订单
        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                controller.setUse(Thread.currentThread().getName(), "N00001");
                Thread.sleep(1000);
                controller.setUnUse(Thread.currentThread().getName(), "N00001");
                return Thread.currentThread().getName() + "执行完毕";
            }
        };

        FutureTask<String> task1 = new FutureTask<>(callable);
        FutureTask<String> task2 = new FutureTask<>(callable);
        FutureTask<String> task3 = new FutureTask<>(callable);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
