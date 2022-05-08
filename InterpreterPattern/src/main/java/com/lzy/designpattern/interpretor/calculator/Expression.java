package com.lzy.designpattern.interpretor.calculator;

import java.util.Map;

/**
 * 抽象表达式
 */
public interface Expression {
    int interpret(Map<String, Integer> context);
}
