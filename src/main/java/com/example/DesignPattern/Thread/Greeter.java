package com.example.DesignPattern.Thread;

public class Greeter implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10000000;i++){
            if(i==1000000){
                try {
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}

class Main{
    public static void main(String[] args) {
        Greeter g1 = new Greeter();
        Thread t1 = new Thread(g1);
        System.out.println(Thread.currentThread().getState().name());
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.currentThread().getName());
        t1.start();
        System.out.println(Thread.currentThread().getState().name());
        System.out.println(Thread.currentThread().getName());
    }
}
