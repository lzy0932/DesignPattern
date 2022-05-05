package com.lzy.designpattern.builder.fastfood;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal chickenBurger = mealBuilder.prepareChickenBurger();
        chickenBurger.showItems();
        System.out.println("Total cost: " + chickenBurger.getCost());

        Meal beefBurger = mealBuilder.prepareBeefBurger();
        beefBurger.showItems();
        System.out.println("Total cost: " + beefBurger.getCost());
    }
}
