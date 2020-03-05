package com.derekprovance.edaman.Constants;

public enum MealType {
    BREAKFAST("breakfast"),
    LUNCH("lunch"),
    DINNER("dinner"),
    SNACK("snack");

    private String type;

    MealType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}
