package com.derekprovance.edamam.DTO;

public class APIAuth {
    private final String appKey;
    private final String appId;

    public APIAuth(String key, String id) {
        this.appKey = key;
        this.appId = id;
    }

    public String getAppKey() {
        return appKey;
    }

    public String getAppId() {
        return appId;
    }
}
