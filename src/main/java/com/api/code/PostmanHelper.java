package com.api.code;

import io.restassured.response.Response;

public class PostmanHelper {
    String url = "https://postman-echo.com/";


    public void getPathParam(String pathParam){
        BaseHelper baseHelper = new BaseHelper();
        System.out.println(url+"get/"+pathParam);

        Response response = baseHelper.get(url+pathParam);
        response.then().statusCode(200); //verifying the status code to be 200
    }
}
