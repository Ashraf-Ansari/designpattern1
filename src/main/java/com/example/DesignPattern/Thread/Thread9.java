package com.kuliza.workbench.service;

public class Thread9 {
}

class CounterStatic{
    static int v;
    CounterStatic(int v){this.v=v;}
    synchronized static void increment(){
//        System.out.println(Thread.currentThread().getName());
        v+=1;
    }
    static int getValue(){
        return v;
    }
}
