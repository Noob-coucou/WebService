package com.client;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class EncryptServiceClient {

    private static final String BASE_URL = "http://localhost:9090/webservice-rs-server-master/api";

    public static void main(String[] args) {
        HttpClient client = HttpClient.newHttpClient();

        String textToEncrypt = "Hello, world!";
        String encryptedText = sendPostRequest(client, "/encryptString", textToEncrypt);
        System.out.println("Encrypted Text: " + encryptedText);

        String decryptedText = sendPostRequest(client, "/decryptString", encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    private static String sendPostRequest(HttpClient client, String path, String body) {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(BASE_URL + path))
                .header("Content-Type", "text/plain")
                .POST(HttpRequest.BodyPublishers.ofString(body))
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            if (response.statusCode() == 200) {
                return response.body();
            } else {
                System.err.println("Error: " + response.statusCode());
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}