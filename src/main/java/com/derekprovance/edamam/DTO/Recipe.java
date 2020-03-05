package com.derekprovance.edamam.DTO;

import com.derekprovance.edamam.Constants.DietLabels;
import com.derekprovance.edamam.Constants.HealthLabels;

import java.util.List;
import java.util.Map;

public class Recipe {
    private String uri;
    private String label;
    private String image;
    private String source;
    private String url;
    private String shareAs;
    private Integer yield;
    private Float calories;
    private Float totalWeight;
    private List<String> cautions;
    private Map<String, NutrientInfo> totalNutrients;
    private Map<String, NutrientInfo> totalDaily;
    private List<DietLabels> dietLabels;
    private List<HealthLabels> healthLabels;
    private List<Ingredient> ingredients;
    private List<String> ingredientLines;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getYield() {
        return yield;
    }

    public void setYield(Integer yield) {
        this.yield = yield;
    }

    public Float getCalories() {
        return calories;
    }

    public void setCalories(Float calories) {
        this.calories = calories;
    }

    public Float getTotalWeight() {
        return totalWeight;
    }

    public void setTotalWeight(Float totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Map<String, NutrientInfo> getTotalNutrients() {
        return totalNutrients;
    }

    public void setTotalNutrients(Map<String, NutrientInfo> totalNutrients) {
        this.totalNutrients = totalNutrients;
    }

    public Map<String, NutrientInfo> getTotalDaily() {
        return totalDaily;
    }

    public void setTotalDaily(Map<String, NutrientInfo> totalDaily) {
        this.totalDaily = totalDaily;
    }

    public List<DietLabels> getDietLabels() {
        return dietLabels;
    }

    public void setDietLabels(List<DietLabels> dietLabels) {
        this.dietLabels = dietLabels;
    }

    public List<HealthLabels> getHealthLabels() {
        return healthLabels;
    }

    public void setHealthLabels(List<HealthLabels> healthLabels) {
        this.healthLabels = healthLabels;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getCautions() {
        return cautions;
    }

    public void setCautions(List<String> cautions) {
        this.cautions = cautions;
    }

    public String getShareAs() {
        return shareAs;
    }

    public void setShareAs(String shareAs) {
        this.shareAs = shareAs;
    }

    public List<String> getIngredientLines() {
        return ingredientLines;
    }

    public void setIngredientLines(List<String> ingredientLines) {
        this.ingredientLines = ingredientLines;
    }
}
