package com.example.DesignPattern.DecoratorDesignPattern;

public class PannerToppings implements ToppingsInterface{
    int price ;
    BasePizza basePizza;
    PannerToppings(int price,BasePizza basePizza){
        this.price=price;
        this.basePizza=basePizza;
    }
    public int priceCalculate(){
        return price+basePizza.priceCalculate();
    }
}
