package com.derekprovance.edaman.Constants;

public enum MeasureCode {
    OUNCE("Ounce", "#Measure_ounce"),
    GRAM("Gram", "#Measure_gram"),
    POUND("Pound", "#Measure_pound"),
    KILOGRAM("Kilogram", "#Measure_kilogram"),
    PINCH("Pinch", "#Measure_pinch"),
    LITER("Liter", "#Measure_liter"),
    FLUID_OUNCE("Fluid-Ounce", "#Measure_fluid_ounce"),
    GALLON("Gallon", "#Measure_gallon"),
    PINT("Pint", "#Measure_pint"),
    QUART("Quart", "#Measure_quart"),
    MILLILITER("Milliliter", "#Measure_milliliter"),
    DROP("Drop", "#Measure_drop"),
    CUP("Cup", "#Measure_cup"),
    TABLESPOON("Tablespoon", "#Measure_tablespoon"),
    TEASPOON("Teaspoon", "#Measure_teaspoon");

    private String label;
    private String code;

    MeasureCode(String label, String code) {
        this.label = label;
        this.code = code;
    }

    public String getMeasureUri() {
        return "http://www.edamam.com/ontologies/edamam.owl" + code;
    }
}
