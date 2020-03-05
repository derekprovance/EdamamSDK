package com.derekprovance.edaman.Service.NutritionAnalysis;

import com.derekprovance.edaman.DTO.NutrientInfo;
import com.derekprovance.edaman.DTO.Recipe;

import java.util.Map;

public class AnalysisResponse extends Recipe {
    private Map<String, NutrientInfo> totalNutrientsKCal;

    public Map<String, NutrientInfo> getTotalNutrientsKCal() {
        return totalNutrientsKCal;
    }

    public void setTotalNutrientsKCal(Map<String, NutrientInfo> totalNutrientsKCal) {
        this.totalNutrientsKCal = totalNutrientsKCal;
    }
}
