package com.webserver.rs;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface EncryptService {

    @POST
    @Path("/encryptString")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    String encryptString(String input);

    @POST
    @Path("/decryptString")
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    String decryptString(String encryptedInput);
}
