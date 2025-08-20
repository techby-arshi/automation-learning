package com.arshi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LocatorsDemo {
    public static void main(String[] args) {
        // 1. Launch Chrome
        WebDriver driver = new ChromeDriver();

        try {
            // 2. Go to saucedemo.com
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();

            // 3. Login with demo credentials
            driver.findElement(By.id("user-name")).sendKeys("standard_user");
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();

            // 4. Click on menu button
            WebElement menu = driver.findElement(By.id("react-burger-menu-btn"));
            menu.click();

            // 5. Wait until About link is visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            WebElement aboutLink = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.linkText("About"))
            );

            // 6. Print the link text
            System.out.println("Link Text Example: " + aboutLink.getText());

        } catch (Exception e) {
            System.out.println("Test failed: " + e.getMessage());
        } finally {
            // 7. Close the browser
            driver.quit();
        }
    }
}
