package com.example.DesignPattern.CompositeDesignPAttern.ArithmaticExpression;

public class Operand implements ArithmaticExpression{
    int value;
    Operand(int value){this.value=value;}

    @Override
    public int evaluate() {
        return value;
    }
}
