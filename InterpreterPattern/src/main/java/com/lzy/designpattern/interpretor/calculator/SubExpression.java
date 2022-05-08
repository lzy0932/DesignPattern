package com.lzy.designpattern.interpretor.calculator;

import java.util.Map;

/**
 * 
 */
public class SubExpression extends SymbolExpression {
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        return left.interpret(context) - right.interpret(context);
    }
}
