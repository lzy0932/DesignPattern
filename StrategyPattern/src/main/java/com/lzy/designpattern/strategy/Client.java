package com.lzy.designpattern.strategy;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new AddOperator());
        int result = context.exec(1, 2);
        System.out.println(result);
    }
}
