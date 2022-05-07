package com.lzy.designpattern.iterator;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("first");
        aggregate.add("second");
        aggregate.add("third");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
