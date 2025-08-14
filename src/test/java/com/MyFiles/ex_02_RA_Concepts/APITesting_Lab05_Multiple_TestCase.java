package com.MyFiles.ex_02_RA_Concepts;

import io.restassured.RestAssured;
//DIRECT BDD NOBODY PREFERS LOT OF REPEATTION DUPLICATES SO USE ALLURE REPORTING ETC>
public class APITesting_Lab05_Multiple_TestCase {
    public static void main(String[] args) {
        String pin = "411011";
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/"+pin)
                .when().log().all()
                .get()
                .then().log().all().statusCode(200);
        pin = "@";
        RestAssured.given().baseUri("https://api.zippopotam.us").
                basePath("/IN/"+pin)
                .when().log().all()
                .get()
                .then().log().all().statusCode(201);
    }

}
