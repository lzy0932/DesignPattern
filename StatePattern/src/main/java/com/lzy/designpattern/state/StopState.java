package com.lzy.designpattern.state;

/**
 * 具体状态
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("结束");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "结束状态";
    }
}
