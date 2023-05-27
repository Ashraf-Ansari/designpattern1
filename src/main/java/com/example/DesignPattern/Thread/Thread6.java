package com.kuliza.workbench.service;

public class Thread6 {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1,"t1");
        Thread t2 = new Thread(r1,"t2");
        Thread t3 = new Thread(r1,"t3");
        t1.start();
        t2.start();
        t3.start();
        System.out.println(Thread.currentThread().getName() + " is finished!");
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            if (0 == (i % 5)) {
                Thread.yield();
                System.out.println(Thread.currentThread().getName() + " State After Yield: " + Thread.currentThread().getState());
            }
            System.out.println(Thread.currentThread().getName() + " i = " + i);
        }
    }
}
