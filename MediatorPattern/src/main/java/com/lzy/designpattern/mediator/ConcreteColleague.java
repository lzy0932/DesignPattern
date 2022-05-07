package com.lzy.designpattern.mediator;

/**
 * 具体同事类
 */
public class ConcreteColleague extends Colleague {
    @Override
    public void receive() {
        System.out.println(this.toString() + "收到请求");
    }

    @Override
    public void send() {
        System.out.println(this.toString() + "发送请求");
        mediator.relay(this);
    }
}
