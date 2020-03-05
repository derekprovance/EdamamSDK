package com.derekprovance.edamam.HttpRequests;

import com.derekprovance.edamam.DTO.APIAuth;
import com.google.gson.Gson;

abstract class HttpRequest {
    protected final String authParams;
    protected Gson gson;

    protected HttpRequest(APIAuth apiAuth) {
        authParams = String.format("?app_id=%s&app_key=%s", apiAuth.getAppId(), apiAuth.getAppKey());
        gson = new Gson();
    }
}
