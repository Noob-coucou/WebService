package com.webserver;

public class CryptoClientTest {

    public static void main(String[] args) {
        // 创建加密解密服务的工厂
        EncryptServiceService encryptFactory = new EncryptServiceService();
        EncryptService encryptServicePort = encryptFactory.getEncryptServicePort();

        // 要加密的字符串
        String originalString = "abc";

        // 调用加密方法
        String encryptedString = encryptServicePort.encryptString(originalString);
        System.out.println("Encrypted: " + encryptedString);

        // 调用解密方法
        String decryptedString = encryptServicePort.decryptString(encryptedString);
        System.out.println("Decrypted: " + decryptedString);
    }
}
