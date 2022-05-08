package com.lzy.designpattern.interpretor.calculator;

import java.util.*;

public class Calculator {

    private Expression expression;

    public Calculator(String expressionString) {
        init(expressionString);
    }

    /**
     * 表达式解析
     */
    private void init(String expressionString) {
        List<Character> charArray = infix2suffix(expressionString);
        Stack<Expression> stack = new Stack<>();
        for (char item : charArray) {
            if (item == '+') {
                if (stack.size() < 2) {
                    throw iae();
                }
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new AddExpression(left, right));
            } else if (item == '-') {
                if (stack.size() < 2) {
                    throw iae();
                }
                Expression right = stack.pop();
                Expression left = stack.pop();
                stack.push(new SubExpression(left, right));
            } else if (item <= 'z' && item >= 'a') {
                stack.push(new ValExpression(String.valueOf(item)));
            } else {
                throw iae();
            }
        }
        if (stack.size() != 1) {
            throw iae();
        }
        this.expression = stack.pop();
    }

    /**
     * 中缀表达式转后缀表达式
     */
    private List<Character> infix2suffix(String infix) {
        List<Character> res = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        Set<Character> operatorSet = new HashSet<>(Arrays.asList('+', '-'));
        for (char item : infix.toCharArray()) {
            //是字母，直接添加到结果列表
            if (item <= 'z' && item >= 'a') {
                res.add(item);
                continue;
            }
            if (operatorSet.contains(item)) {
                if (!stack.isEmpty()) {
                    res.add(stack.pop());
                }
                stack.push(item);
            } else {
                throw iae();
            }
        }
        while (!stack.isEmpty()) {
            res.add(stack.pop());
        }
        return res;
    }

    private IllegalArgumentException iae() {
        return new IllegalArgumentException("illegal expression");
    }

    public int run(Map<String, Integer> var) {
        return this.expression.interpret(var);
    }
}
