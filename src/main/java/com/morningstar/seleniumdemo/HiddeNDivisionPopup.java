package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddeNDivisionPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.busonlineticket.com/");
        Thread.sleep(2000);
        driver.findElement(By.name("deptdate")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//i[@class='fa fa-calendar-alt'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'28')]")).click();



    }
}
