package com.derekprovance.edamam.HttpRequests;

import com.derekprovance.edamam.DTO.APIAuth;
import com.derekprovance.edamam.DTO.Hits;
import com.derekprovance.edamam.Service.RecipeSearch.RecipeQueryParameters;
import org.apache.http.HttpException;

import java.io.IOException;

public class RecipeSearchHttpRequest extends HttpRequest {
    public RecipeSearchHttpRequest(APIAuth apiAuth) {
        super(apiAuth);
    }

    public Hits search(RecipeQueryParameters queryParameters) throws HttpException {
        String uri = "https://api.edamam.com/search" + authParams + queryParameters.toString();

        try {
            return gson.fromJson(HttpRequestClient.getInstance().makeGETRequest(uri), Hits.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
