package com.example.DesignPattern.StrategyPattern;

public class TataCar extends BASECAR{

    TataCar() {
        super(new BaseHorn());
    }
}
