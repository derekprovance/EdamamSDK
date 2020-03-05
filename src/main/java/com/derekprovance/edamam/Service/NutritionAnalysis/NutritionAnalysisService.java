package com.derekprovance.edamam.Service.NutritionAnalysis;

import com.derekprovance.edamam.DTO.APIAuth;
import com.derekprovance.edamam.HttpRequests.NutritionAnalysisHttpRequest;
import org.apache.http.HttpException;

import java.util.ArrayList;
import java.util.List;

public class NutritionAnalysisService {
    private NutritionAnalysisHttpRequest nutritionAnalysisHttpRequest;

    public NutritionAnalysisService(APIAuth apiAuth) {
        nutritionAnalysisHttpRequest = new NutritionAnalysisHttpRequest(apiAuth);
    }

    public NutritionAnalysisService(String apiKey, String appId) {
        nutritionAnalysisHttpRequest = new NutritionAnalysisHttpRequest(new APIAuth(apiKey, appId));
    }

    public List<AnalysisResponse> acquireNutritionInfo(List<String> ingredients) throws HttpException {
        List<AnalysisResponse> responses = new ArrayList<>();
        for(String ingredient : ingredients) {
            responses.add(nutritionAnalysisHttpRequest.getFoodTextAnalysis(ingredient));
        }

        return responses;
    }

    public AnalysisResponse postNewRecipe(RecipeAnalysisRequest recipeAnalysisRequest) throws HttpException {
        return nutritionAnalysisHttpRequest.postNewRecipe(recipeAnalysisRequest);
    }
}
