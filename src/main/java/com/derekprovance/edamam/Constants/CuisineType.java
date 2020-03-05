package com.derekprovance.edamam.Constants;

public enum CuisineType {
    AMERICAN("American"),
    ASIAN("Asian"),
    BRITISH("British"),
    CARIBBEAN("Caribbean"),
    CENTRAL_EUROPE("Central Europe"),
    CHINESE("Chinese"),
    EASTERN_EUROPE("Eastern Europe"),
    FRENCH("French"),
    INDIAN("Indian"),
    ITALIAN("Italian"),
    JAPANESE("Japanese"),
    KOSHER("Kosher"),
    MEDITERRANEAN("Mediterranean"),
    MEXICAN("Mexican"),
    MIDDLE_EASTERN("Middle Eastern"),
    NORDIC("Nordic"),
    SOUTH_AMERICAN("South American"),
    SOUTH_EAST_ASIAN("South East Asian");

    private String name;

    CuisineType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
