package com.lzy.designpattern.visitor.feedpet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 对象结构
 */
public class Home {
    private List<Pet> list = new ArrayList<>();

    public void accept(Person person) {
        Iterator<Pet> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().accept(person);
        }
    }

    public void add(Pet pet) {
        list.add(pet);
    }
}
