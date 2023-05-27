package com.example.DesignPattern.Thread;

public class Thread4 {
    public static void main(String[] args) throws InterruptedException {
        inMethod();
        Runnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1,"t1");
        Thread t2 = new Thread(r1,"t2");
        t1.start();
//        t1.join();
        t2.start();
//        System.out.println(Thread.currentThread().getName());
//        System.out.println(Thread.currentThread().getState().name());
    }
    static void inMethod(){
        System.out.println("inside in method");
    }

}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        method2();
    }
    void method2(){
        System.out.println("inside method 2");
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
