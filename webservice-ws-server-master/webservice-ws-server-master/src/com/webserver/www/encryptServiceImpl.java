package com.webserver.www;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface encryptServiceImpl {

    @WebMethod
    String encryptString(String input);

    @WebMethod
    String decryptString(String encryptedInput);
}
