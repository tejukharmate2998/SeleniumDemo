package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        //Thread.sleep(30000);
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.moveToElement(driver.findElement(By.linkText("MEN")));
        //Thread.sleep(2000);
        actions.perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Topwear')]"))).perform();


    }
}
