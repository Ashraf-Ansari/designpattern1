package com.example.DesignPattern.AbstractFactoryMethod;

public class MainClass {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new AbstractFactory();
        abstractFactory.getShapeType("Circle").getShape("circle").draw();
        abstractFactory.getShapeType("Square").getShape("Rectangle").draw();
        abstractFactory.getShapeType("Circle").getShape("Pentagon").draw();
        abstractFactory.getShapeType("Square").getShape("Square").draw();
    }
}
