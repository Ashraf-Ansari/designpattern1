package com.example.DesignPattern.StrategyPattern;

public class BASECAR {
    Horn horn;
    BASECAR(Horn horn){
        this.horn=horn;
    }
    void wheel(){
        System.out.println("base car wheel");
    }
    public String hornMethod(){
        return horn.horn();
    }
}
