package com.lzy.designpattern.strategy;

/**
 * 具体策略
 */
public class AddOperator implements Operator {
    @Override
    public int operate(int x, int y) {
        return x + y;
    }
}
