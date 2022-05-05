package com.lzy.designpattern.singleton.hungrysingleton.staticblock;

/**
 * 静态代码块式
 */
public class Singleton {
    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的静态变量instance
    private static Singleton instance;

    //在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }
    //对外提供获取该对象的方法
    public static Singleton getInstance(){
        return instance;
    }
}

