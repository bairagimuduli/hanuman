package com.api.test.bg;

import com.api.code.bg.BhagwatGitaHelper;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BhagwatGitaTest {
    String clientId = "9gP4e4LU8fqltGiAM9WA4Roaz7QIBZNqrwOOwwAe";
    String clientSecret = "s3ZjaLFQCnJqDAoBL14PCe0Q1mbIi3UdlbJzbrzwNONbUoLdEO";
    String grantType = "client_credentials";
    String scope = "verse chapter";

    @Test
    public void testToken() {
        BhagwatGitaHelper bhagwatGitaHelper = new BhagwatGitaHelper();
        Response accessToken = bhagwatGitaHelper.getAccessToken(clientId, clientSecret, grantType, scope);
        Assert.assertEquals(accessToken.getStatusCode(), 200, "api failed");
    }
}
