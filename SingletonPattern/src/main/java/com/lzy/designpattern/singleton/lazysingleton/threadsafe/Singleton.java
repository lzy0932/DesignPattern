package com.lzy.designpattern.singleton.lazysingleton.threadsafe;

/**
 * 线程安全方式
 */
public class Singleton {
    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的静态变量instance
    private static Singleton instance;

    //对外提供公共的访问方法
    public static synchronized Singleton getInstance(){
        //判断instance是否为null，如果为null，说明还没有创建Singleton类的对象
        //如果没有，创建一个并返回；如果有，直接返回
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

