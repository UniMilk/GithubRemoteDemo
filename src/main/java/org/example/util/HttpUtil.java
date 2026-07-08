package org.example.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class HttpUtil {
    public String get(String url) {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpGet getReq = new HttpGet(url);
            CloseableHttpResponse resp = client.execute(getReq);
            return EntityUtils.toString(resp.getEntity());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

    public void post(String url, String body) {
        
    }
}
