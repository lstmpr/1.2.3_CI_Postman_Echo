package ru.netology;

import io.restassured.response.ValidatableResponse;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.equalTo;


public class PostmanEcho {
    @Test
    void shouldPost() {
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain; charset=UTF-8")
                .body("some data")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"))
                ;
    }

}
