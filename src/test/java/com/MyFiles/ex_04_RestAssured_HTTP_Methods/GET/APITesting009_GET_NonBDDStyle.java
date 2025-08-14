package com.MyFiles.ex_04_RestAssured_HTTP_Methods.GET;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class APITesting009_GET_NonBDDStyle {
    String pin = "12345";
    //given
    RequestSpecification r;
    //when
    Response resp;
    //Then
    ValidatableResponse vr;

    @Test
    public void GETNonBDD(){
        pin = "12345";

    r = RestAssured.given();
    r.baseUri("https://api.zippopotam.us");
    r.basePath("/IN/"+pin);

    //Response
        resp = r.when().log().all().get();

                //Validate
        vr = resp.then().log().all();
                vr.statusCode(200);
    }

    @Test
    public void GETNBDNegativePin(){
    pin = "@";
    r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN/"+pin);

    resp = r.when().log().all().get();

    vr = resp.then().log().all().statusCode(404);


    }
}
