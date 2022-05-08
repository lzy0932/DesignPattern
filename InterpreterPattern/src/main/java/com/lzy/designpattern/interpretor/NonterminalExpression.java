package com.lzy.designpattern.interpretor;

/**
 * 非终结符表达式
 */
public class NonterminalExpression implements Expression {
    private Expression exp1;
    private Expression exp2;

    @Override
    public void interpret(String info) {
        // 非对终结符表达式的处理
    }
}
