package com.derekprovance.edamam.Service.FoodDatabase;

import com.derekprovance.edamam.DTO.*;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.http.HttpException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FoodDatabaseServiceTest {
    Dotenv dotenv = Dotenv.load();

    APIAuth apiAuth = new APIAuth(dotenv.get("FOOD_DB_APP_API_KEY"), dotenv.get("FOOD_DB_APP_ID"));
    FoodDatabaseService foodDatabaseService = new FoodDatabaseService(apiAuth);

    @Test
    void searchForSpecificFood() throws HttpException {
        FoodQueryParameters query = new FoodQueryParameters();
        query.setUpc("044000002930");

        FoodDatabaseResponse foodDatabaseResponse = foodDatabaseService.searchForSpecificFood(query);

        assertFalse(foodDatabaseResponse.getHints().isEmpty());

        Food food = foodDatabaseResponse.getHints().get(0).getFood();
        assertNotNull(food);
        assertFalse(food.getBrand().isEmpty());
        assertFalse(food.getCategory().isEmpty());
        assertFalse(food.getImage().isEmpty());
    }

    @Test
    void getNutritionInfo() throws HttpException {
        FoodDatabaseNutrientRequest foodDatabaseNutrientRequest = new FoodDatabaseNutrientRequest();
        List<Ingredient> ingredients = new ArrayList<>();
        Ingredient ingredient = new Ingredient();
        ingredient.setFoodId("food_bb9z17hblj0hfla5q2eaeazjqeav");
        ingredient.setMeasureUri("http://www.edamam.com/ontologies/edamam.owl#Measure_unit");
        ingredient.setQuantity(5f);
        ingredients.add(ingredient);
        foodDatabaseNutrientRequest.setIngredients(ingredients);

        Recipe recipe = foodDatabaseService.getNutritionInfo(foodDatabaseNutrientRequest);

        assertNotNull(recipe);
    }

    @Test
    void autoCompleteTest() throws HttpException {
        String query = "White Castle";

        List<String> results = foodDatabaseService.findNameOfFood(query, 10);

        assertNotNull(results);
        assertTrue(results.size() > 0);
    }
}