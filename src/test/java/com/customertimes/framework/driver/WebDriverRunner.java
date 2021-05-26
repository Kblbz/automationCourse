package com.customertimes.framework.driver;

import com.customertimes.framework.config.TestConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverRunner {

    private static WebDriver driver;

    private WebDriverRunner() {
    }

    public static WebDriver getWebDriver() {
        if (driver == null) {
        //    switch (System.getProperty("browser")) { --> we had this code first, but chrome wasn't open as default browser and there was nullpointer exception. So we had to create config.properties file and change this line as follows:
            switch (TestConfig.CONFIG.browser()) {
                case "firefox": {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                }
                default: {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
            }
            driver.manage().window().maximize();
        }
        return driver;
    }

    public static void closeWebDriver() {
        if (driver != null) {
            driver.close();
        }
    }
}
