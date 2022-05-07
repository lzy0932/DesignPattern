package com.lzy.designpattern.visitor;

/**
 * 具体元素
 */
public class ConcreteElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "具体元素A的操作";
    }
}
