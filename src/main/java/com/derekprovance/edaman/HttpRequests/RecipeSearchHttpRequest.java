package com.derekprovance.edaman.HttpRequests;

import com.derekprovance.edaman.DTO.APIAuth;
import com.derekprovance.edaman.DTO.Hits;
import com.derekprovance.edaman.Service.RecipeSearch.RecipeQueryParameters;
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
