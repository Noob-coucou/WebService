package com.webserver.www;
import javax.jws.WebMethod;
import javax.jws.WebService;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@WebService
public class EncryptService implements encryptServiceImpl {

    @WebMethod
    public String encryptString(String input) {
        String encryptedResult = xorEncrypt(input);
        return Base64.getEncoder().encodeToString(encryptedResult.getBytes(StandardCharsets.UTF_8));
    }

    @WebMethod
    public String decryptString(String encryptedInput) {
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedInput);
        String decryptedResult = xorEncrypt(new String(decodedBytes, StandardCharsets.UTF_8));
        return decryptedResult;
    }

    private String xorEncrypt(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ 42);
        }
        return new String(chars);
    }
}
