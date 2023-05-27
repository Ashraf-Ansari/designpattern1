package com.example.DesignPattern.CompositeDesignPAttern.ArithmaticExpression;

public class MainClass {
    public static void main(String[] args) {
        ArithmaticExpression o1 = new Operand(2);
        ArithmaticExpression o2 = new Operand(3);
        ArithmaticExpression o3 = new Operand(4);
        ArithmaticExpression e2 = new Operator(o2,"*",o3);
        ArithmaticExpression e1 = new Operator(o1,"+",e2);
        System.out.println(e1.evaluate());
    }
}
