package com.example.DesignPattern.CompositeDesignPAttern.ArithmaticExpression;

import java.util.ArrayList;
import java.util.List;

public class Operator implements ArithmaticExpression{
    ArithmaticExpression left;
    ArithmaticExpression right;
    String operator;
    Operator(ArithmaticExpression left,String operator,ArithmaticExpression right){
        this.left=left;
        this.right=right;
        this.operator=operator;
    }
    @Override
    public int evaluate() {
        int value = 0;
        switch (operator){
            case "+":
                value= left.evaluate()+ right.evaluate();
                break;
            case "-":
                value= left.evaluate()- right.evaluate();
                break;
            case "*":
                value= left.evaluate()*right.evaluate();
                break;
            case "/":
                value= left.evaluate()/ right.evaluate();
                break;
        }
        return value;
    }
}
