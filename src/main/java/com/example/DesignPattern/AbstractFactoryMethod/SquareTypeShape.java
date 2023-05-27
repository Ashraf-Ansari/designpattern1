package com.example.DesignPattern.AbstractFactoryMethod;

public class SquareTypeShape implements ShapeAbstractFactory{
    @Override
    public Shape getShape(String shape) {
        if(shape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        if(shape.equalsIgnoreCase("Square"))
            return new Square();
        return null;
    }
}
