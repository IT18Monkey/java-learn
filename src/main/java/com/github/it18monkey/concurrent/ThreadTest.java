package com.github.it18monkey.concurrent;

/**
 * Created by whh on 2018/4/30.
 */
public class ThreadTest {
    private int number = 0;

    public synchronized void inc() {
        number++;
    }

    public synchronized void dec() {
        number--;
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadTest obj = new ThreadTest();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    obj.dec();
                }
                System.out.println("dec number end");
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100000; i++) {
                    obj.inc();
                }
                System.out.println("inc number end");
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(obj.getNumber());//如果方法不加Synchronize，结果不一定是0
    }
}
