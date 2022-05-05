package com.lzy.designpattern.singleton.hungrysingleton.staticvariable;

/**
 * 静态变量式
 */
public class Singleton {
    //1.私有构造方法
    private Singleton(){}

    //2.在本类中创建对象
    private static Singleton instance = new Singleton();

    //3.提供一个公共的访问方法，让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }
}

