package com.api.test.postman;

import com.api.code.PostmanHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGet {
    PostmanHelper postmanHelper;

    @BeforeMethod
    public void setUp() {
        postmanHelper = new PostmanHelper();
    }

    @Test
    public void testGet() {
        postmanHelper.getPathParam("");
    }
}
