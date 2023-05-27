package com.example.DesignPattern.AbstractFactoryMethod;

public class AbstractFactory {
    ShapeAbstractFactory getShapeType(String shapeType){
        if(shapeType.equalsIgnoreCase("Circle"))
            return new CircleTypeShape();
        if(shapeType.equalsIgnoreCase("square"))
            return new SquareTypeShape();
        return null;
    }
}
