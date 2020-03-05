package com.derekprovance.edaman.Service.NutritionAnalysis;

import com.derekprovance.edaman.DTO.APIAuth;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.http.HttpException;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NutritionAnalysisServiceTest {
    Dotenv dotenv = Dotenv.load();

    APIAuth apiAuth = new APIAuth( dotenv.get("NUTR_ANLYS_APP_API_KEY"), dotenv.get("NUTR_ANLYS_APP_APP_ID"));
    NutritionAnalysisService nutritionAnalysisService = new NutritionAnalysisService(apiAuth);

    @org.junit.jupiter.api.Test
    void acquireNutritionInfo() throws HttpException {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("1 Egg");
        ingredients.add("2 Apples");

        List<AnalysisResponse> responses = nutritionAnalysisService.acquireNutritionInfo(ingredients);

        assertFalse(responses.isEmpty());

        AnalysisResponse response = responses.get(0);
        assertNotNull(response.getTotalNutrients());
        assertNotNull(response.getTotalNutrientsKCal());
        assertNotNull(response.getTotalWeight());
        assertNotNull(response.getCalories());
        assertNotNull(response.getTotalDaily());
    }

    @org.junit.jupiter.api.Test
    void postNewRecipe() throws HttpException {
        RecipeAnalysisRequest recipeAnalysisRequest = new RecipeAnalysisRequest();
        recipeAnalysisRequest.setTitle("Testing");
        recipeAnalysisRequest.setPrep("Prep");
        recipeAnalysisRequest.setYield("5");
        List<String> temp = new ArrayList<>();
        temp.add("1 Egg");
        recipeAnalysisRequest.setIngredient(temp);
        AnalysisResponse recipeAnalysisResponse = nutritionAnalysisService.postNewRecipe(recipeAnalysisRequest);

        assertNotNull(recipeAnalysisResponse.getTotalNutrients());
        assertNotNull(recipeAnalysisResponse.getTotalNutrientsKCal());
        assertNotNull(recipeAnalysisResponse.getTotalWeight());
        assertNotNull(recipeAnalysisResponse.getCalories());
        assertNotNull(recipeAnalysisResponse.getTotalDaily());
    }
}