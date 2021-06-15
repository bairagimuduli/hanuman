package com.api.code.bg;

import com.api.code.BaseHelper;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class BhagwatGitaHelper {
    public static String url = "https://bhagavadgita.io/";

    public Response getAccessToken(String clientId, String clientSecret, String grantType, String scope){

        String baseUrl = url+"auth/oauth/token";
        BaseHelper baseHelper = new BaseHelper();
        Map<String, String> urlEncodedParam = new HashMap<>();
        urlEncodedParam.put("client_id",clientId);
        urlEncodedParam.put("client_secret",clientSecret);
        urlEncodedParam.put("grant_type",grantType);
        urlEncodedParam.put("scope",scope);
        Response response = baseHelper.post(baseUrl, urlEncodedParam, true);
        response.prettyPrint();
        return response;

    }
}
