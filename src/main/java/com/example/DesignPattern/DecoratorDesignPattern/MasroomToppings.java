package com.example.DesignPattern.DecoratorDesignPattern;

public class MasroomToppings implements BasePizza{
    int price ;
    BasePizza basePizza;
    MasroomToppings(int price,BasePizza basePizza){
        this.price=price;
        this.basePizza=basePizza;
    }
    public int priceCalculate(){
        return price+basePizza.priceCalculate();
    }
}
