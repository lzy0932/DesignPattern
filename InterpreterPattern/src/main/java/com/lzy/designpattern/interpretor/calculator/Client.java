package com.lzy.designpattern.interpretor.calculator;

import java.util.HashMap;
import java.util.Map;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        String expStr = "a+b-c";

        Map<String, Integer> context = new HashMap<>();
        context.put("a", 12);
        context.put("b", 34);
        context.put("c", 56);

        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果：" + expStr + "=" + calculator.run(context));
    }
}
