package com.derekprovance.edaman.Service.FoodDatabase;

import com.derekprovance.edaman.DTO.APIAuth;
import com.derekprovance.edaman.DTO.Recipe;
import com.derekprovance.edaman.HttpRequests.FoodDatabaseHttpRequest;
import org.apache.http.HttpException;

import java.util.List;

public class FoodDatabaseService {
    FoodDatabaseHttpRequest foodDatabaseHttpRequest;

    FoodDatabaseService(APIAuth apiAuth) {
        foodDatabaseHttpRequest = new FoodDatabaseHttpRequest(apiAuth);
    }

    FoodDatabaseService(String apiKey, String appId) {
        foodDatabaseHttpRequest = new FoodDatabaseHttpRequest(new APIAuth(apiKey, appId));
    }

    public FoodDatabaseResponse searchForSpecificFood(FoodQueryParameters foodQueryParameters) throws HttpException {
        return foodDatabaseHttpRequest.foodDatabaseRequest(foodQueryParameters);
    }

    public Recipe getNutritionInfo(FoodDatabaseNutrientRequest foodDatabaseNutrientRequest) throws HttpException {
        return foodDatabaseHttpRequest.nutritionDataRequest(foodDatabaseNutrientRequest);
    }

    public List<String> findNameOfFood(String query) throws HttpException {
        return findNameOfFood(query, 10);
    }

    public List<String> findNameOfFood(String query, Integer limit) throws HttpException {
        String sanitizedQuery = query.replace(" ", "%20").toLowerCase();

        return foodDatabaseHttpRequest.autoCompleteRequest(sanitizedQuery, limit);
    }
}
