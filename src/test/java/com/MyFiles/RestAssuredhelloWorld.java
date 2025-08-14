package com.MyFiles;

import io.restassured.RestAssured;

public class RestAssuredhelloWorld {
    public static void main(String[] args) {
        //url - https://restful-booker.herokuapp.com/ping
        RestAssured.given().baseUri("https://restful-booker.herokuapp.com")
                .basePath("/ping")
                .when()
                .log().all().get().
                then()
                        .statusCode(201);
    }
}
