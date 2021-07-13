package com.github.neemiasjnr.kotlinplayground

import javax.inject.Inject
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import com.github.neemiasjnr.kotlinplayground.greeting.GreetingService
import com.github.neemiasjnr.kotlinplayground.greeting.GreetingResponse

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class Main {
    @Inject
    lateinit var greetingService: GreetingService

    @GET
    @Path("{name}")
    fun hello(@PathParam("name") name: String): GreetingResponse = greetingService.greeting(name)
}
