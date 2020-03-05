package com.derekprovance.edamam.Service.RecipeSearch;

import com.derekprovance.edamam.Constants.*;
import com.derekprovance.edamam.Service.QueryParametersObject;
import com.google.gson.annotations.SerializedName;

public class RecipeQueryParameters extends QueryParametersObject {
    @SerializedName(value = "q")
    private String query;
    @SerializedName(value = "r")
    private String recipeId;
    private Integer from;
    private Integer to;
    @SerializedName(value = "ingr")
    private Integer ingredient;
    private DietLabels diet;
    private HealthLabels health;
    private CuisineType cuisineType;
    private MealType mealType;
    private DishType dishType;
    private String calories;
    private String time;
    private String excluded;
    private String callback;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public Integer getIngredient() {
        return ingredient;
    }

    public void setIngredient(Integer ingredient) {
        this.ingredient = ingredient;
    }

    public DietLabels getDiet() {
        return diet;
    }

    public void setDiet(DietLabels diet) {
        this.diet = diet;
    }

    public HealthLabels getHealth() {
        return health;
    }

    public void setHealth(HealthLabels health) {
        this.health = health;
    }

    public CuisineType getCuisineType() {
        return cuisineType;
    }

    public void setCuisineType(CuisineType cuisineType) {
        this.cuisineType = cuisineType;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public DishType getDishType() {
        return dishType;
    }

    public void setDishType(DishType dishType) {
        this.dishType = dishType;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getExcluded() {
        return excluded;
    }

    public void setExcluded(String excluded) {
        this.excluded = excluded;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback;
    }
}
