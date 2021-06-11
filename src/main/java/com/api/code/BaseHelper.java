package com.api.code;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseHelper {
    public Response get(String urlParam){
        Response response = RestAssured.get();
        response.prettyPrint(); // print the response
        return response;

    }
}
