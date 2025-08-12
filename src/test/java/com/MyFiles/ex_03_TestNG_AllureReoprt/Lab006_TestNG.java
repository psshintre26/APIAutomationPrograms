package com.MyFiles.ex_03_TestNG_AllureReoprt;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Lab006_TestNG {

    @Test
    public void TC1ValidPIN(){
        String pin= "110048";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pin)
                .when().log().all().get()
                .then().log().all().statusCode(200);
    }  //valid pin

    @Test
    public void TC22SplCharPin(){
        String pin= "@#";
        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pin)
                .when().log().all().get()
                .then().log().all().statusCode(201);
    }  //special char

    @Test
    public void TC3BlankPin(){} //blank
}
