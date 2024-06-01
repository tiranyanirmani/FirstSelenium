package com.pragmatictestlabs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloSelenium {
    @Test
    public void helloSelenium(){
        // Setup web browser driver (Chrome driver)
        WebDriverManager.chromedriver().setup();

        // Open a web browser (Chrome driver)
        WebDriver driver = new ChromeDriver();

        // Navigate to the Login screen (Type URL https://www.saucedemo.com)
        driver.get("https://www.saucedemo.com");

        // Type Username standard_user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");

        // Type Password secret_sauce
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click the login button
        driver.findElement(By.id("login-button")).click();

        // Verify/check the Product label is available in the landing page after login
        Assert.assertEquals(driver.findElement(By.cssSelector("span.title")).getText(),"Products");

        // Close the browser
        driver.quit();

    }
}
