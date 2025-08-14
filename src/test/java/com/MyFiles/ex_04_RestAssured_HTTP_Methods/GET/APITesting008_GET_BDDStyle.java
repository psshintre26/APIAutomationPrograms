package com.MyFiles.ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting008_GET_BDDStyle {
    @Test
    public void TestGetReq (){
        String pin = "411038";
        RestAssured
                .given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin)

                .when()
                .log()
                .all()
                .get()

                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
