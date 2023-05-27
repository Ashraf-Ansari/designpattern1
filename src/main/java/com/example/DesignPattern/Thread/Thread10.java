package com.kuliza.workbench.service;

import java.util.ArrayList;
import java.util.List;

public class Thread10 {
    public static void main(String[] args) throws InterruptedException {
        PC pc = new PC();
        PRunnable pRunnable = new PRunnable(pc);
        CRunnable cRunnable = new CRunnable(pc);
        Thread t1 = new Thread(pRunnable,"t1");
        Thread t2 = new Thread(cRunnable,"t2");
        Thread t3 = new Thread(cRunnable,"t3");
        Thread t4 = new Thread(cRunnable,"t4");
        t2.start();
        t1.start();
//        t1.join();
//        t2.join();
        t3.start();
        t4.start();
    }
}
class PC{
    List<String> shareObject = new ArrayList<>(5);

    synchronized void produce() throws InterruptedException {
        System.out.println("inside produce "+Thread.currentThread().getName());

        while (shareObject.size()==5){
            System.out.println(Thread.currentThread().getName() + " BUFFER IS FULL. Going into Wait State!");
            wait();

        }
        shareObject.add("Ashraf");
        System.out.println(Thread.currentThread().getName() + " Produced Element: ");
        notify();

    }
    synchronized void consume() throws InterruptedException {
        System.out.println("inside consume "+Thread.currentThread().getName());
        while(shareObject.size()==0){
            System.out.println(Thread.currentThread().getName() + " BUFFER IS EMPTY. Going into Wait State!");
            wait();
        }
        shareObject.remove(0);
        System.out.println(Thread.currentThread().getName() + " Consumed Element: ");
        notify();

    }
}
class PRunnable implements Runnable{
    PC pc;
    PRunnable(PC pc){this.pc=pc;}

    @Override
    public void run() {
        while (true) {
            try {
                pc.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class CRunnable implements Runnable{
    PC pc;
    CRunnable(PC pc){this.pc=pc;}

    @Override
    public void run() {
        while (true) {
            try {
                pc.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
