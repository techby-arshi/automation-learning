package com.arshi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCSS {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // CSS by id (#id)
        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");

        // CSS by attribute
        driver.findElement(By.cssSelector("input[data-test='password']")).sendKeys("secret_sauce");

        // CSS by class (.className)
        driver.findElement(By.cssSelector(".submit-button")).click();

        driver.quit();
    }
}
