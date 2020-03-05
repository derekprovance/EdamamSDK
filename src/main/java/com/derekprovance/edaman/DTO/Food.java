package com.derekprovance.edaman.DTO;

import com.derekprovance.edaman.Constants.NutrientCodes;

import java.util.Map;

public class Food {
    private String foodId;
    private String label;
    private Map<NutrientCodes, Float> nutrients;
    private String brand;
    private String category;
    private String categoryLabel;
    private String foodContentsLabel;
    private String image;

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

    public Map<NutrientCodes, Float> getNutrients() {
        return nutrients;
    }

    public void setNutrients(Map<NutrientCodes, Float> nutrients) {
        this.nutrients = nutrients;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    public String getFoodContentsLabel() {
        return foodContentsLabel;
    }

    public void setFoodContentsLabel(String foodContentsLabel) {
        this.foodContentsLabel = foodContentsLabel;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
