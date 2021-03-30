package com.portal;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverSettings {
    public ChromeDriver driver;
    public WebDriverWait wait;
    public final String SITE_URL = "http://localhost:8085/";
    public final String LOGIN_URL = "http://localhost:8085/login";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/webapp/WEB-INF/resources/drivers/chromedriver89.0.4389.23.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);

    }

    @After
    public void close() {
        driver.quit();
    }
}
