package com.lzy.designpattern.template;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Game game = new Football();
        game.play();
        System.out.println();
        game = new Basketball();
        game.play();
    }
}
