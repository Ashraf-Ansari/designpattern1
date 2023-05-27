package com.example.DesignPattern.StrategyPattern;

public class SportsCar extends BASECAR{

    SportsCar() {
        super(new SportsHorn());
    }
}
