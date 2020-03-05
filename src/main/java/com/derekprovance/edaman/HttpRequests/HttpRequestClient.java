package com.derekprovance.edaman.HttpRequests;

import org.apache.http.HttpException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

class HttpRequestClient {
    private static HttpRequestClient httpRequestClient;
    private CloseableHttpClient httpClient;

    static HttpRequestClient getInstance() {
        if(httpRequestClient == null) {
            httpRequestClient = new HttpRequestClient();
        }

        return httpRequestClient;
    }

    HttpRequestClient() {
        httpClient = HttpClients.createDefault();
    }

    public String makeGETRequest(String uri) throws IOException, HttpException {
        HttpGet request = new HttpGet(uri);

        return processRequest(request);
    }

    public String makePOSTRequest(String uri, String jsonBody) throws IOException, HttpException {
        HttpPost post = new HttpPost(uri);
        post.addHeader("content-type", "application/json");

        post.setEntity(new StringEntity(jsonBody));

        return processRequest(post);
    }

    private String processRequest(HttpUriRequest request) throws IOException, HttpException {
        String result = "";

        try (CloseableHttpClient httpClient = HttpClients.createDefault();
             CloseableHttpResponse response = httpClient.execute(request)) {
            if(response.getStatusLine().getStatusCode() != 200) {
                throw new HttpException("Request was unsuccessful " + response.getStatusLine().getStatusCode());
            }

            result = EntityUtils.toString(response.getEntity());
        }

        return result;
    }
}
