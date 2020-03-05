package com.derekprovance.edamam.DTO;

import java.util.List;

public class Ingredient {
    private String foodId;
    private Float quantity;
    private Measure measure;
    private Float weight;
    private Food food;
    private String measureUri;
    private List<Parsed> parsed;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public String getMeasureUri() {
        return measureUri;
    }

    public void setMeasureUri(String measureUri) {
        this.measureUri = measureUri;
    }

    public List<Parsed> getParsed() {
        return parsed;
    }

    public void setParsed(List<Parsed> parsed) {
        this.parsed = parsed;
    }
}
