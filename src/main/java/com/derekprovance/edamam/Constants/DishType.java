package com.derekprovance.edamam.Constants;

public enum DishType {
    BREAD("Bread"),
    CEREALS("Cereals"),
    CONDIMENTS_AND_SAUCES("Condiments and sauces"),
    DRINKS("Drinks"),
    DESSERTS("Desserts"),
    MAIN_COURSE("Main course"),
    PANCAKE("Pancake"),
    PREPS("Preps"),
    PRESERVE("Preserve"),
    SALAD("Salad"),
    SANDWICHES("Sandwiches"),
    SIDE_DISH("Side dish"),
    SOUP("Soup"),
    STARTER("Starter"),
    SWEETS("Sweets");

    private String type;

    DishType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
