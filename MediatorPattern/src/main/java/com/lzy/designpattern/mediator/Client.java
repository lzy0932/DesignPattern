package com.lzy.designpattern.mediator;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague();
        Colleague colleague2 = new ConcreteColleague();
        mediator.register(colleague1);
        mediator.register(colleague2);
        colleague1.send();
        colleague2.send();
    }
}
