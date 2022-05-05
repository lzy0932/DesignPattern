package com.lzy.designpattern.singleton.lazysingleton.doublecheckedlocking;

/**
 * 双重检测锁方式
 */
public class Singleton {
    //私有构造方法
    private Singleton(){}

    //声明Singleton类型的变量instance
    private static volatile Singleton instance;

    //对外提供公共的访问方式
    public static synchronized Singleton getInstance(){
        //第一次判断，如果instance不为null，不需要抢占锁，直接返回对象
        if (instance == null) {
            synchronized (Singleton.class){
                //第二次判断
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

