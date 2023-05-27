package com.example.DesignPattern.DecoratorDesignPattern;

public class CakeToppings implements ToppingsInterface{
    int price ;
    BasePizza basePizza;
    CakeToppings(int price,BasePizza basePizza){
        this.price=price;
        this.basePizza=basePizza;
    }
    public int priceCalculate(){
        return price+basePizza.priceCalculate();
    }
}
