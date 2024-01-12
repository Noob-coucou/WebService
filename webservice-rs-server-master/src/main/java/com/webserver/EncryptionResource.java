package com.webserver;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

@Path("/encryption")
public class EncryptionResource {

    @POST
    @Path("/encrypt")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String encryptString(String input) {
        // 简单的异或运算加密
        String encryptedResult = xorEncrypt(input);

        // 使用Base64编码
        return Base64.getEncoder().encodeToString(encryptedResult.getBytes(StandardCharsets.UTF_8));
    }

    @POST
    @Path("/decrypt")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String decryptString(String encryptedInput) {
        // 使用Base64解码
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedInput);

        // 简单的异或运算解密
        String decryptedResult = xorEncrypt(new String(decodedBytes, StandardCharsets.UTF_8));
        return decryptedResult;
    }

    private String xorEncrypt(String input) {
        // 简单的异或运算加密解密
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (chars[i] ^ 42); // 42 是一个简单的密钥，可以替换为其他值
        }
        return new String(chars);
    }
}
