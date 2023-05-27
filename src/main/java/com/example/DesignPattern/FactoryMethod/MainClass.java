package com.example.DesignPattern.FactoryMethod;

public class MainClass {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        obj.getShape("circle").draw();
        obj.getShape("Rectangle").draw();
        obj.getShape("Pentagon").draw();
        obj.getShape("square").draw();
    }
}
