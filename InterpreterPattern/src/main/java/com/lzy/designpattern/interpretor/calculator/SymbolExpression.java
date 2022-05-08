package com.lzy.designpattern.interpretor.calculator;

/**
 * 非终结符表达式
 */
public abstract class SymbolExpression implements Expression {
    protected Expression left;
    protected Expression right;

    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
