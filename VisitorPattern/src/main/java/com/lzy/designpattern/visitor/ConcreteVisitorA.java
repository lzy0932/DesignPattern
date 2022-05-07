package com.lzy.designpattern.visitor;

/**
 * 具体访问者
 */
public class ConcreteVisitorA implements Visitor {
    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体访问者A访问-->" + concreteElementA.operation());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体访问者A访问-->" + concreteElementB.operation());
    }
}
