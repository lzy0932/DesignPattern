package com.lzy.designpattern.state;

/**
 * 具体状态
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("开始");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "开始状态";
    }
}
