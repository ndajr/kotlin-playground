package com.github.neemiasjnr.kotlinplayground

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.junit.jupiter.api.Test
import org.hamcrest.CoreMatchers.`is`

@QuarkusTest
class MainTest {

    @Test
    fun testHelloEndpoint() {
        given()
            .`when`().get("/hello/john")
            .then()
            .statusCode(200)
            .body("message", `is`("Hello john!"))
    }

}
