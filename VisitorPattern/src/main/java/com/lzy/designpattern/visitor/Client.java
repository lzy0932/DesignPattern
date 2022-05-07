package com.lzy.designpattern.visitor;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
