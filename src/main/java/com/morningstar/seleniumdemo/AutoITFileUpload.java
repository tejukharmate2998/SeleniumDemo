package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AutoITFileUpload {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.guru99.com/test/autoit.html");
        //driver.findElement(By.id("postjob")).click();
        //driver.findElement(By.name("q3_name")).sendKeys("Teju");
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@id='input_3']")).sendKeys("Teju@gmail.com");


        //driver.findElement(By.id("input_4")).click();
        //Runtime.getRuntime().exec("C:\\Users\\tkharma\\Documents.exe");
        //driver.findElement(By.id("input_6")).sendKeys("AutoIT in Selenium");
        //driver.findElement(By.id("input_2")).click();
        //driver.close();
    }
}
