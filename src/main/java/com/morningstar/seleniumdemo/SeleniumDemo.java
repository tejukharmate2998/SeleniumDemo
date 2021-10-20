package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(30000);
        System.out.println(driver.getTitle());
        driver.findElement(By.name("username")).sendKeys("teju@gmail.com");
        //driver.close();


    }
}
