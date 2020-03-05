package com.derekprovance.edamam.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Parsed {
    private String foodId;
    private String label;
    private String measure;
    private Float quantity;
    private String food;
    private String foodContentsLabel;
    private Float weight;
    private Float retainedWeight;
    @SerializedName(value = "measureURI")
    private String measureUri;
    private String status;
    private List<String> qualifiers;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFoodContentsLabel() {
        return foodContentsLabel;
    }

    public void setFoodContentsLabel(String foodContentsLabel) {
        this.foodContentsLabel = foodContentsLabel;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getRetainedWeight() {
        return retainedWeight;
    }

    public void setRetainedWeight(Float retainedWeight) {
        this.retainedWeight = retainedWeight;
    }

    public String getMeasureUri() {
        return measureUri;
    }

    public void setMeasureUri(String measureUri) {
        this.measureUri = measureUri;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<String> getQualifiers() {
        return qualifiers;
    }

    public void setQualifiers(List<String> qualifiers) {
        this.qualifiers = qualifiers;
    }
}
