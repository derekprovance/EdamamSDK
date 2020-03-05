package com.derekprovance.edamam.Constants;

public enum HealthLabels {
    VEGAN("vegan"),
    VEGETARIAN("vegetarian"),
    DAIRY_FREE("diary-free"),
    LOW_SUGAR("low-sugar"),
    LOW_FAT_ABS("low-fat-abs"),
    SUGAR_CONSCIOUS("sugar-conscious"),
    FAT_FREE("fat free"),
    GLUTEN_FREE("gluten free"),
    WHEAT_FREE("wheat free"),
    PEANUT_FREE("peanut-free"),
    ALCOHOL_FREE("alcohol-free"),
    SULPHITE_FREE("sulphite-free"),
    TREE_NUT_FREE("tree-nut-free"),
    CELERY_FREE("celery-free"),
    CRUSTCEAN_FREE("crustacean-free");

    private final String name;

    HealthLabels(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
