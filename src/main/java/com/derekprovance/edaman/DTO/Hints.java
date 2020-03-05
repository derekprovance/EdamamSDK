package com.derekprovance.edaman.DTO;

import java.util.List;

public class Hints {
    private Food food;
    private List<Measure> measures;

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public List<Measure> getMeasures() {
        return measures;
    }

    public void setMeasures(List<Measure> measures) {
        this.measures = measures;
    }
}
