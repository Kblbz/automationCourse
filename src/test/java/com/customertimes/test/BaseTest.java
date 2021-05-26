package com.customertimes.test;

import com.customertimes.framework.driver.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    protected WebDriver driver;

    @BeforeSuite
    public void setup() {
        driver = WebDriverRunner.getWebDriver(); // --> you may also do that in @BeforeClass - it's up to you
    }

    @AfterSuite
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
    }
}
