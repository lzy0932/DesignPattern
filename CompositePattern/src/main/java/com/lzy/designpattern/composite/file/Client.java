package com.lzy.designpattern.composite.file;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Directory directory = new Directory("目录");
        directory.add(new Directory("子目录").add(new File("文档", 5))
                                                    .add(new File("表格", 5)))
                .add(new File("文件", 1))
                .add(new File("视频", 10));
        directory.printList();
    }
}
