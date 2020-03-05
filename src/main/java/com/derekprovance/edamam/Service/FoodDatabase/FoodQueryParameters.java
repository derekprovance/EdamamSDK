package com.derekprovance.edamam.Service.FoodDatabase;

import com.derekprovance.edamam.Constants.HealthLabels;
import com.derekprovance.edamam.Service.QueryParametersObject;
import com.google.gson.annotations.SerializedName;

public class FoodQueryParameters extends QueryParametersObject {
    @SerializedName(value = "ingr")
    private String ingredient;
    private String upc;
    @SerializedName(value = "nutrition-type")
    private String nutritionType;
    private HealthLabels health;
    private Integer calories;
    private String category;
    private String categoryLabel;

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getNutritionType() {
        return nutritionType;
    }

    public void setNutritionType(String nutritionType) {
        this.nutritionType = nutritionType;
    }

    public HealthLabels getHealth() {
        return health;
    }

    public void setHealth(HealthLabels health) {
        this.health = health;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }
}
