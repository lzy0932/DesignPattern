package com.lzy.designpattern.strategy;

/**
 * 环境
 */
public class Context {
    private Operator operator;

    public Context(Operator operator) {
        this.operator = operator;
    }

    public int exec(int x, int y) {
        return operator.operate(x, y);
    }
}
