package com.lzy.designpattern.facade;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.drawCircle();
        shapeFacade.drawRectangle();
    }
}
