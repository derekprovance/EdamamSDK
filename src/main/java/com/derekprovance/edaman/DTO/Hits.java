package com.derekprovance.edaman.DTO;

import com.google.gson.annotations.SerializedName;

public class Hits {
    @SerializedName(value = "q")
    private String query;
    private String from;
    private String to;
    private String[][] params;
    private Integer count;
    private Boolean more;
    private Hit[] hits;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String[][] getParams() {
        return params;
    }

    public void setParams(String[][] params) {
        this.params = params;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }

    public Hit[] getHits() {
        return hits;
    }

    public void setHits(Hit[] hits) {
        this.hits = hits;
    }
}
