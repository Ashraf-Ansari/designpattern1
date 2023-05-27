package com.example.DesignPattern.DecoratorDesignPattern;

public class BaseNormalPizza implements BasePizza{
    int price;

    BaseNormalPizza(int price){
        this.price=price;
    }
    @Override
    public int priceCalculate() {
        return price;
    }
}
