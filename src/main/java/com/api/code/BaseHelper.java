package com.api.code;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseHelper {

    /**
     * @param urlParam
     * @return
     */
    public Response get(String urlParam) {
        Response response = RestAssured.get();
        response.prettyPrint(); // print the response
        return response;
    }

    /**
     * @param urlParam
     * @param queryParam
     * @return
     */
    public Response get(String urlParam, Map<String, String> queryParam) {
        Response response = given().queryParams(queryParam).get(urlParam);
        response.prettyPrint(); // print the response
        return response;
    }

    /**
     * @param urlParam
     * @param headers
     * @return
     */
    public Response get(String urlParam, Headers headers) {
        Response response = given().headers(headers).get(urlParam);
        response.prettyPrint(); // print the response
        return response;
    }

    /**
     * @param urlParam
     * @param queryParam
     * @param headers
     * @return
     */
    public Response get(String urlParam, Map<String, String> queryParam, Headers headers) {
        Response response = given().queryParams(queryParam).headers(headers).get(urlParam);
        response.prettyPrint(); // print the response
        return response;
    }

}
