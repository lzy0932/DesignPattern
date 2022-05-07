package com.lzy.designpattern.template;

/**
 * 具体子类
 */
public class Football extends Game {
    @Override
    public void initialize() {
        System.out.println("热身");
    }

    @Override
    public void start() {
        System.out.println("开始踢球");
    }

    @Override
    public void end() {
        System.out.println("结束踢球");
    }
}
