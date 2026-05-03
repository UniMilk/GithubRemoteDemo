package org.example.util;

import static org.junit.jupiter.api.Assertions.*;

class HttpUtilTest {

    @org.junit.jupiter.api.Test
    void testGet() {
        HttpUtil httpUtil = new HttpUtil();
        String resp = httpUtil.get("https://www.github.com");
        System.out.println(resp);
    }
}