package com.derekprovance.edaman.HttpRequests;

import com.derekprovance.edaman.DTO.APIAuth;
import com.derekprovance.edaman.DTO.Recipe;
import com.derekprovance.edaman.Service.FoodDatabase.FoodDatabaseNutrientRequest;
import com.derekprovance.edaman.Service.FoodDatabase.FoodDatabaseResponse;
import com.derekprovance.edaman.Service.FoodDatabase.FoodQueryParameters;
import org.apache.http.HttpException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FoodDatabaseHttpRequest extends HttpRequest {
    public FoodDatabaseHttpRequest(APIAuth apiAuth) {
        super(apiAuth);
    }

    public FoodDatabaseResponse foodDatabaseRequest(FoodQueryParameters query) throws HttpException {
        String uri = "https://api.edamam.com/api/food-database/parser" + authParams + query.toString();

        try {
            return gson.fromJson(HttpRequestClient.getInstance().makeGETRequest(uri), FoodDatabaseResponse.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public Recipe nutritionDataRequest(FoodDatabaseNutrientRequest requestBody) throws HttpException {
        String uri = "https://api.edamam.com/api/food-database/nutrients" + authParams;

        try {
            return gson.fromJson(HttpRequestClient.getInstance().makePOSTRequest(uri, gson.toJson(requestBody)), Recipe.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public List<String> autoCompleteRequest(String query, Integer limit) throws HttpException {
        String uri = String.format("http://api.edamam.com/auto-complete%s&q=%s&limit=%s", authParams, query, limit);

        try {
            return gson.fromJson(HttpRequestClient.getInstance().makeGETRequest(uri), ArrayList.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
