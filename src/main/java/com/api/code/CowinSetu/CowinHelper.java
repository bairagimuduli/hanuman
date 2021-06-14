package com.api.code.CowinSetu;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CowinHelper {
    public void getStates(){
        Headers headers = new Headers(new Header("accept","application/json"),
                new Header("Accept-Language","hi_IN"));

        Response response = given().accept(ContentType.JSON).headers(headers).get("https://cdn-api.co-vin.in/api/v2/admin/location/states");
        response.prettyPrint();
    }
}


/**
 curl --location --request
 GET 'https://cdn-api.co-vin.in/api/v2/admin/location/states'
 --header 'accept: application/json' --header 'Accept-Language: hi_IN'
 **/