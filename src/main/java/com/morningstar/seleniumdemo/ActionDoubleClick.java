package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDoubleClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://api.jquery.com/dblclick/");
        Actions actions = new Actions(driver);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        WebElement doubleClick= driver.findElement(By.cssSelector("body:nth-child(2) > div:nth-child(1)"));
        Thread.sleep(2000);
        actions.doubleClick(doubleClick).perform();
        Thread.sleep(1000);
        actions.doubleClick(doubleClick).perform();


    }
}
