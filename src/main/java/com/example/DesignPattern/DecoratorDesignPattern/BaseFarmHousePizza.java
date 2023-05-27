package com.example.DesignPattern.DecoratorDesignPattern;

public class BaseFarmHousePizza implements BasePizza{
    int price;
    BaseFarmHousePizza(int price){
        this.price=price;
    }
    @Override
    public int priceCalculate() {
        return price;
    }
}
