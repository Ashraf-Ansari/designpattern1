package com.example.DesignPattern.FactoryMethod;

public class ShapeFactory {
    Shape getShape(String shape){
        if(shape.equalsIgnoreCase("circle"))
            return new Circle();
        if(shape.equalsIgnoreCase("square"))
            return new Square();
        if(shape.equalsIgnoreCase("rectangle"))
            return new Rectangle();
        if(shape.equalsIgnoreCase("pentagon"))
            return new Pentagon();
        return null;
    }
}
