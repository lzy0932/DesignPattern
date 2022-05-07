package com.lzy.designpattern.state;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        System.out.println(context.getState());

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState());
    }
}
