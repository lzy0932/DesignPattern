package com.lzy.designpattern.template;

/**
 * 具体子类
 */
public class Basketball extends Game {
    @Override
    protected void pause() {
        super.pause();
        System.out.println("喝水");
    }

    @Override
    protected boolean isInitialize() {
        return false;
    }

    @Override
    public void initialize() {
    }

    @Override
    public void start() {
        System.out.println("开始打球");
    }

    @Override
    public void end() {
        System.out.println("结束打球");
    }
}
