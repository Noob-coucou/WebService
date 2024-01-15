package com.webserver;

public class CryptoClientTest {

    public static void main(String[] args) {
        EncryptServiceService encryptFactory = new EncryptServiceService();
        EncryptService encryptServicePort = encryptFactory.getEncryptServicePort();

        String originalString = "abc";

        String encryptedString = encryptServicePort.encryptString(originalString);
        System.out.println("Encrypted: " + encryptedString);

        String decryptedString = encryptServicePort.decryptString(encryptedString);
        System.out.println("Decrypted: " + decryptedString);
    }
}
