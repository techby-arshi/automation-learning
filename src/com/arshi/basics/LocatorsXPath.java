package com.arshi.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXPath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        // Xpath absolute
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");

        // Xpath relative with contains
        driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("secret_sauce");

        // Xpath with text()
        driver.findElement(By.xpath("//input[@id='login-button']")).click();

        driver.quit();
    }
}
