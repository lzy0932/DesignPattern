package com.lzy.designpattern.builder.fastfood;

public class MealBuilder {
    public Meal prepareChickenBurger() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Cole());
        return meal;
    }

    public Meal prepareBeefBurger() {
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Juice());
        return meal;
    }
}
