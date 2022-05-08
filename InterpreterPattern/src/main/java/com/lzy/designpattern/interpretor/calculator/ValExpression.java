package com.lzy.designpattern.interpretor.calculator;

import java.util.Map;

/**
 * 终结符表达式
 */
public class ValExpression implements Expression {
    private String key;

    public ValExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpret(Map<String, Integer> context) {
        if (context.containsKey(key)) {
            return context.get(key);
        }
        throw new IllegalArgumentException("not found field " + key);
    }
}
