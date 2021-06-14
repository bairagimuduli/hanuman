package com.api.test.cowin;

import com.api.code.CowinSetu.CowinHelper;
import org.testng.annotations.Test;

public class TestCowin {

    @Test
    public void testName() {
        CowinHelper cowinHelper = new CowinHelper();
        cowinHelper.getStates();
    }
}
