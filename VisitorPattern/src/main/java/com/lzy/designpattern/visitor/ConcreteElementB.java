package com.lzy.designpattern.visitor;

/**
 * 具体元素
 */
public class ConcreteElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operation() {
        return "具体元素B的元素操作";
    }
}
