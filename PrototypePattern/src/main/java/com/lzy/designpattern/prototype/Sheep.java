package com.lzy.designpattern.prototype;

import java.io.*;
import java.util.Date;

/**
 * 原型类
 */
public class Sheep implements Cloneable, Serializable {
    private String name;

    private Date date;

    public Sheep(String name, Date date) {
        super();
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // 深拷贝 方式一：重写clone()方法
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            // super.clone()返回Object对象
            sheep = (Sheep) super.clone();
            // 单独处理引用类型的成员变量
            sheep.date = (Date) this.date.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }

    // 深拷贝 方式二：序列化和反序列化
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            // 序列化
            // 输出对象流
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this); //当前这个对象以对象流的方式输出

            // 反序列化
            // 将输出的对象流读进来，实现克隆
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep copyObj = (Sheep) ois.readObject();

            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            // 关闭流
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
