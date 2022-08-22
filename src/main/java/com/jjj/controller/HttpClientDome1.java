package com.jjj.controller;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;


public class HttpClientDome1 {
    public void doGetTestOne(){

        //获取Http客户端
        CloseableHttpClient closeableHttpClient = HttpClientBuilder.create().build();

        //创建Get请求
        HttpGet httpGet = new HttpGet("");





    }

}
