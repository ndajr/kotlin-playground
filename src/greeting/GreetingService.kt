package com.github.neemiasjnr.kotlinplayground.greeting

import javax.enterprise.context.ApplicationScoped

data class GreetingResponse(var message: String = "")

@ApplicationScoped
class GreetingService {
    fun greeting(name: String): GreetingResponse = GreetingResponse("Hello $name!")
}
