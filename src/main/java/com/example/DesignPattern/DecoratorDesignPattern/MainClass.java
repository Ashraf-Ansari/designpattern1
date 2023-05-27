package com.example.DesignPattern.DecoratorDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        BasePizza normalBasePizza = new BaseNormalPizza(60);
        BasePizza BasePizzaFarmhouse = new BaseFarmHousePizza(90);
        System.out.println(new PannerToppings(35,normalBasePizza).priceCalculate());
        System.out.println(new MasroomToppings(25,new PannerToppings(12,normalBasePizza)).priceCalculate());
        System.out.println(new PannerToppings(35,new CakeToppings(15,BasePizzaFarmhouse)).priceCalculate()  );
    }
}
