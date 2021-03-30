package com.portal.access;

import com.portal.WebDriverSettings;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Role_Administrator extends WebDriverSettings {

    @Test
    public void adminAuth() {
        driver.get(SITE_URL);
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Газпром питание"));

        WebElement nav = driver.findElement(By.className("nav"));
        nav.findElement(By.cssSelector("[href=\"/login\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("form")));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.id("username")).sendKeys("admin");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.id("password")).sendKeys("admin");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("button[type=\"submit\"]")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.cssSelector("[href=\"/logout\"]"));

    }
}
