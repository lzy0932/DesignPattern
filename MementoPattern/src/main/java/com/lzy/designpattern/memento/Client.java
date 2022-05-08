package com.lzy.designpattern.memento;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态1");
        System.out.println("初始状态：" + originator.getState());
        caretaker.setMemento(originator.saveSate());
        originator.setState("状态2");
        System.out.println("新的状态：" + originator.getState());
        originator.restoreState(caretaker.getMemento());
        System.out.println("恢复状态：" + originator.getState());
    }
}
