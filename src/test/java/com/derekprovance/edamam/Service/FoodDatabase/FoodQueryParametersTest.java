package com.derekprovance.edamam.Service.FoodDatabase;

import com.derekprovance.edamam.Constants.HealthLabels;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FoodQueryParametersTest {

    @Test
    void testToString() {
        FoodQueryParameters query = new FoodQueryParameters();
        query.setCalories(15);
        query.setCategory("generic-foods");
        query.setCategoryLabel("food");
        query.setHealth(HealthLabels.PEANUT_FREE);
        query.setIngredient("1 Egg");

        String generatedString = query.toString();

        assertTrue(generatedString.contains("&calories=15"));
        assertTrue(generatedString.contains("&category=generic-foods"));
        assertTrue(generatedString.contains("&categoryLabel=food"));
        assertTrue(generatedString.contains("&health=peanut-free"));
        assertTrue(generatedString.contains("&ingr=1%20Egg"));
    }
}