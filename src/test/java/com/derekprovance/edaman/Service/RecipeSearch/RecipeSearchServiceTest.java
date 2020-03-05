package com.derekprovance.edaman.Service.RecipeSearch;

import com.derekprovance.edaman.Constants.DietLabels;
import com.derekprovance.edaman.Constants.MealType;
import com.derekprovance.edaman.DTO.APIAuth;
import com.derekprovance.edaman.DTO.Hits;
import io.github.cdimascio.dotenv.Dotenv;
import org.apache.http.HttpException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecipeSearchServiceTest {

    @Test
    void findRecipes() throws HttpException {
        Dotenv dotenv = Dotenv.load();
    
        APIAuth apiAuth = new APIAuth( dotenv.get("RCP_SRCH_APP_API_KEY"), dotenv.get("RCP_SRCH_APP_ID"));
        RecipeSearchService recipeSearchService = new RecipeSearchService(apiAuth);

        RecipeQueryParameters queryParameters = new RecipeQueryParameters();
        queryParameters.setDiet(DietLabels.BALANCED);
        queryParameters.setQuery("Potato");

        Hits hits = recipeSearchService.findRecipes(queryParameters);

        assertNotNull(hits.getHits());
        assertTrue(hits.getHits().length > 0);
    }
}