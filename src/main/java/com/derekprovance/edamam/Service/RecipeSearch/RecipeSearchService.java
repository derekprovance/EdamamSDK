package com.derekprovance.edamam.Service.RecipeSearch;

import com.derekprovance.edamam.DTO.APIAuth;
import com.derekprovance.edamam.DTO.Hits;
import com.derekprovance.edamam.HttpRequests.RecipeSearchHttpRequest;
import org.apache.http.HttpException;

public class RecipeSearchService {
    private RecipeSearchHttpRequest recipeSearchHttpRequest;

    RecipeSearchService(APIAuth apiAuth) {
        recipeSearchHttpRequest = new RecipeSearchHttpRequest(apiAuth);
    }

    RecipeSearchService(String apiKey, String appId) {
        recipeSearchHttpRequest = new RecipeSearchHttpRequest(new APIAuth(apiKey, appId));
    }

    public Hits findRecipes(RecipeQueryParameters queryParameters) throws HttpException {
        return recipeSearchHttpRequest.search(queryParameters);
    }
}
