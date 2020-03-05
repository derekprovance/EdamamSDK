package com.derekprovance.edaman.Service.RecipeSearch;

import com.derekprovance.edaman.DTO.APIAuth;
import com.derekprovance.edaman.DTO.Hits;
import com.derekprovance.edaman.HttpRequests.RecipeSearchHttpRequest;
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
