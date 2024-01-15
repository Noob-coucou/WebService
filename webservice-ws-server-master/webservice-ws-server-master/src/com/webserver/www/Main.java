package com.webserver.www;

import javax.xml.ws.Endpoint;

public class Main {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8085/ws_server/encrypt", new EncryptService());
        System.out.println("发布加密服务成功");
    }
}
