package com.example.DesignPattern.Thread;

public class MainClass {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Current Thread is: " + currentThread.getName());
    }

}
