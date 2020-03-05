package com.derekprovance.edamam.Service.FoodDatabase;

import com.derekprovance.edamam.DTO.Ingredient;

import java.util.List;

public class FoodDatabaseNutrientRequest {
    private List<Ingredient> ingredients;

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
