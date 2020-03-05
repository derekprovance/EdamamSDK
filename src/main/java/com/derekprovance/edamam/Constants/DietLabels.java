package com.derekprovance.edamam.Constants;

public enum DietLabels {
    BALANCED("balanced"),
    HIGH_PROTEIN("high-protein"),
    HIGH_FIBER("high-fiber"),
    LOW_FAT("low-fat"),
    LOW_CARB("low-carb"),
    LOW_SODIUM("low-sodium");

    private final String name;

    DietLabels(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
