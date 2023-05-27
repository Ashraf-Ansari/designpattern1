package com.kuliza.workbench.service;

public class Thread7 {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter(0);
        MyRunnable7 myRunnable7 = new MyRunnable7(counter);
        Thread t1 = new Thread(myRunnable7,"t1");
        Thread t2 = new Thread(myRunnable7,"t2");
        Thread t3 = new Thread(myRunnable7,"t3");
        t1.start();
        t2.start();
        t3.start();
//        t1.join();
//        t2.join();
//        t3.join();
        System.out.println(counter.getValue());
    }
}
class Counter{
    int v;
    Counter(int v){this.v=v;}
    synchronized void increment(){
//        System.out.println(Thread.currentThread().getName());
        v+=1;
    }
    int getValue(){
        return v;
    }
}
class MyRunnable7 implements Runnable{

    Counter counter;
    MyRunnable7(Counter counter){this.counter=counter;}
    @Override
    public void run() {
        System.out.println("begin "+ Thread.currentThread().getName() +" value "+counter.getValue());
        synchronized (this) {
            for (int i = 0; i <= 100000; i++)
                counter.increment();
        }
        System.out.println("end "+Thread.currentThread().getName() +" value "+counter.getValue());
    }
}
