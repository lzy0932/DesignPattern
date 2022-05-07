package com.lzy.designpattern.template;

/**
 * 抽象类
 */
public abstract class Game {
    // 抽象方法
    public abstract void initialize();
    public abstract void start();
    public abstract void end();

    // 具体方法
    protected void pause() {
        System.out.println("休息");
    }

    // 钩子方法
    protected boolean isInitialize() {
        return true;
    }

    // 模板方法(定义为final方法，不让子类覆盖)
    public final void play() {
        if (isInitialize()) {
            initialize();
        }
        start();
        pause();
        end();
    }
}
