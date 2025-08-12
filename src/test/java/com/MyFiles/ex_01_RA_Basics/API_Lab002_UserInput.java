package com.MyFiles.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class API_Lab002_UserInput {
    public static void main(String[] args) {
        //gherkin syntax
        //given url when http method like get post and then response validation

        Scanner s1= new Scanner(System.in);
        System.out.println("Enter pincode");
        String pin = s1.next();

        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pin)
                .when().log().all()
                .get()
                .then().log().all().statusCode(200);
    }
}
