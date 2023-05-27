package com.example.DesignPattern.StrategyPattern;

public class MainClass {

    public static void main(String[] args) {
        BASECAR obj = new NanoCar();
        System.out.println(obj.hornMethod());
        System.out.println("welcome to design pattern");
    }
}
