package com.arshi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsLinkTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // First login normally
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // linkText (clicking on "Twitter")
        WebElement twitterLink = driver.findElement(By.linkText("Twitter"));
        System.out.println("Twitter link text: " + twitterLink.getText());

        // partialLinkText (clicking "Face" instead of "Facebook")
        WebElement facebookLink = driver.findElement(By.partialLinkText("Face"));
        System.out.println("Facebook link text: " + facebookLink.getText());

        driver.quit();
    }
}
