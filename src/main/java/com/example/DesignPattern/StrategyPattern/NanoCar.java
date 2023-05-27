package com.example.DesignPattern.StrategyPattern;

public class NanoCar extends BASECAR{

    NanoCar() {
        super(new BaseHorn());
    }

}
