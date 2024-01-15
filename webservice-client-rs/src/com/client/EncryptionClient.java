package com.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author 59245
 * @date 2024/01/12
 */
public class EncryptionClient {

    public static void main(String[] args) {
        String encryptEndpoint = "http://localhost:9090/webservice-rs-server-master/api/encryption/encrypt";
        String decryptEndpoint = "http://localhost:9090/webservice-rs-server-master/api/encryption/decrypt";

        // Sample input
        String inputText = "Hello, World!";

        // Encrypt
        String encryptedResult = sendPostRequest(encryptEndpoint, inputText);
        System.out.println("Encrypted Result: " + encryptedResult);

        // Decrypt
        String decryptedResult = sendPostRequest(decryptEndpoint, encryptedResult);
        System.out.println("Decrypted Result: " + decryptedResult);
    }

    private static String sendPostRequest(String endpoint, String input) {
        try {
            URL url = new URL(endpoint);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "text/plain");
            connection.setDoOutput(true);

            try (OutputStream outputStream = connection.getOutputStream()) {
                byte[] inputBytes = input.getBytes("UTF-8");
                outputStream.write(inputBytes, 0, inputBytes.length);
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder response = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                return response.toString();
            }

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
