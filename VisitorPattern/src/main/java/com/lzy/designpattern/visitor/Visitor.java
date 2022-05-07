package com.lzy.designpattern.visitor;

/**
 * 抽象访问者
 */
public interface Visitor {
    void visit(ConcreteElementA concreteElementA);
    void visit(ConcreteElementB concreteElementB);
}
