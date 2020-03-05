package com.derekprovance.edaman.Constants;

public enum NutrientCodes {
    CA("Calcium", UnitsOfMeasure.MG),
    CHOCDF("Carbs", UnitsOfMeasure.G),
    CHOLE("Cholesterol", UnitsOfMeasure.MG),
    FAMS("Monounsaturated", UnitsOfMeasure.G),
    FAPU("Polyunsaturated", UnitsOfMeasure.G),
    FASAT("Saturated", UnitsOfMeasure.G),
    FAT("Fat", UnitsOfMeasure.G),
    FATRN("Trans", UnitsOfMeasure.G),
    FE("Iron", UnitsOfMeasure.MG),
    FIBTG("Fiber", UnitsOfMeasure.G),
    FOLDFE("Folate", null),
    K("Potassium", UnitsOfMeasure.MG),
    MG("Magnesium", UnitsOfMeasure.MG),
    NA("Sodium", UnitsOfMeasure.MG),
    ENERC_KCAL("Energy", UnitsOfMeasure.KCAL),
    NIA("Niacin", UnitsOfMeasure.MG),
    P("Phosphorus", UnitsOfMeasure.MG),
    PROCNT("Protein", UnitsOfMeasure.G),
    RIBF("Riboflavin", UnitsOfMeasure.MG),
    SUGAR("Sugars", UnitsOfMeasure.G),
    THIA("Thiamin", UnitsOfMeasure.MG),
    TOCPHA("Vitamin E", UnitsOfMeasure.MG),
    VITA_RAE("Vitamin A", null),
    VITB12("Vitamin B12", null),
    VITB6A("Vitamin B6", UnitsOfMeasure.MG),
    VITC("Vitamin C", UnitsOfMeasure.MG),
    VITD("Vitamin D", null),
    VITK1("Vitamin K", null);

    private String name;
    private UnitsOfMeasure unit;

    NutrientCodes(String name, UnitsOfMeasure unit) {
        this.name = name;
        this.unit = unit;
    }
}
