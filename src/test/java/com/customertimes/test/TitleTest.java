package com.customertimes.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TitleTest extends BaseTest {

    @Test
    public void checkSiteTitle()  {
        driver.get("https://www.windy.com/");

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String expectedTitle = "Windy: Wind map & weather forecast";
        String actualTitle = driver.getTitle();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTitle, expectedTitle, "title is not expected");
        softAssert.assertAll();
    }
}




