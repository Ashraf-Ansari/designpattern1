package com.example.DesignPattern.AbstractFactoryMethod;

public class CircleTypeShape implements ShapeAbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("Circle"))
            return new Circle();
        if(shape.equalsIgnoreCase("Pentagon"))
            return new Pentagon();
        return null;
    }
}
