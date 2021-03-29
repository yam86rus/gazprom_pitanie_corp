package com.portal;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/webapp/WEB-INF/resources/drivers/chromedriver89.0.4389.23.exe");
        driver = new ChromeDriver();
    }

    @After
    public void close() {
        driver.quit();
    }
}
