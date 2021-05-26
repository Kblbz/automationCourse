package com.customertimes.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class CalculateTest {

    @DataProvider (name = "data-provider")
    public Object[][] dataProviderMethod(Method m) {
        switch (m.getName()) {
            case "Sum":
                return new Object[][] {{4, 1, 5}, {9, 11, 20}};
            case "Diff":
                return new Object[][] {{4, 1, -3}, {9, 11, -2}};
         }
         return null;
    }

    @Test (dataProvider = "data-provider")
    public void Sum (int a, int b, int expectedSum) {
        int actualSum = a + b;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualSum, expectedSum, "Result is not expected");
        softAssert.assertAll();
    }

    @Test (dataProvider = "data-provider")
    public void Diff (int a, int b, int expectedDiff) {
        int actualDiff = a - b;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualDiff, expectedDiff, "Result is not expected");
        softAssert.assertAll();
    }
}