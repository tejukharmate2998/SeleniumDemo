package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        //Thread.sleep(30000);
        Actions actions = new Actions(driver);
        //Thread.sleep(1000);
        actions.contextClick(driver.findElement(By.xpath("//span[(text() ='right click me')]"))).perform();
        Thread.sleep(2000);
        actions.contextClick(driver.findElement(By.xpath("//span[(text() ='Copy')]"))).perform();
        Thread.sleep(2000);
        //handling alert popup also
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }
}
