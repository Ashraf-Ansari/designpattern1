package com.example.DesignPattern.StrategyPattern;

public class SUVCar extends BASECAR{

    SUVCar() {
        super(new SportsHorn());
    }
}
