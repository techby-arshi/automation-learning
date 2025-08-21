package com.arshi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsClassTag {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // Login using className
        WebElement username = driver.findElement(By.className("input_error"));
        username.sendKeys("standard_user");

        // Using tagName (finds the FIRST <input> element on the page)
        WebElement firstInput = driver.findElement(By.tagName("input"));
        firstInput.clear(); // clearing to show effect
        firstInput.sendKeys("standard_user"); // again typing

        driver.quit();
    }
}
