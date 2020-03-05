package com.derekprovance.edamam.Service.FoodDatabase;

import com.derekprovance.edamam.DTO.Hints;
import com.derekprovance.edamam.DTO.Links;
import com.derekprovance.edamam.DTO.Parsed;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FoodDatabaseResponse {
    private String text;
    private List<Parsed> parsed;
    private List<Hints> hints;
    @SerializedName(value = "_links")
    private Links links;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Parsed> getParsed() {
        return parsed;
    }

    public void setParsed(List<Parsed> parsed) {
        this.parsed = parsed;
    }

    public List<Hints> getHints() {
        return hints;
    }

    public void setHints(List<Hints> hints) {
        this.hints = hints;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
