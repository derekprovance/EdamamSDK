package com.derekprovance.edamam.HttpRequests;

import com.derekprovance.edamam.DTO.APIAuth;
import com.derekprovance.edamam.Service.NutritionAnalysis.RecipeAnalysisRequest;
import com.derekprovance.edamam.Service.NutritionAnalysis.AnalysisResponse;
import org.apache.http.HttpException;

import java.io.IOException;

public class NutritionAnalysisHttpRequest extends HttpRequest {
    public NutritionAnalysisHttpRequest(APIAuth apiAuth) {
        super(apiAuth);
    }

    public AnalysisResponse getFoodTextAnalysis(String ingredients) throws HttpException {
        String ingredientParams = "&ingr=" + ingredients.replace(" ", "%20");
        String uri = "https://api.edamam.com/api/nutrition-data" + authParams + ingredientParams;

        try {
            String jsonResponse = HttpRequestClient.getInstance().makeGETRequest(uri);
            return gson.fromJson(jsonResponse, AnalysisResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public AnalysisResponse postNewRecipe(RecipeAnalysisRequest recipeAnalysisRequest) throws HttpException {
        String uri = "https://api.edamam.com/api/nutrition-details" + authParams;

        try {
            String response = HttpRequestClient.getInstance().makePOSTRequest(uri, gson.toJson(recipeAnalysisRequest));
            return gson.fromJson(response, AnalysisResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
