package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDropDown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.istqb.in/");
        WebElement foundation = driver.findElement(By.linkText("FOUNDATION"));
        Actions actions = new Actions(driver);

        actions.moveToElement(foundation).perform();
        Thread.sleep(3000);
       actions.moveToElement(driver.findElement(By.linkText("ENROLLMENT"))).click().perform();


    }
}


