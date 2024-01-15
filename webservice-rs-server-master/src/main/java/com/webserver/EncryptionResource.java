package com.webserver;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author 59245
 * @date 2024/01/12
 */
@Path("/encryption")
public class EncryptionResource {

    @POST
    @Path("/encrypt")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    public String encryptString(String input) {
        String encryptedResult = xorEncrypt(input);

        return Base64.getEncoder().encodeToString(encryptedResult.getBytes(StandardCharsets.UTF_8));
    }

    @POST
    @Path("/decrypt")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
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
