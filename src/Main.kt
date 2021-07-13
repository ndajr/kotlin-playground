package com.github.neemiasjnr.kotlinplayground

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType.TEXT_PLAIN

@Path("/hello")
class GreetingResource {
    @GET
    @Produces(TEXT_PLAIN)
    fun hello(): String {
        return "hello"
    }
}
