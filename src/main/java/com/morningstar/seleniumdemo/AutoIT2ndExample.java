package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AutoIT2ndExample {
        public static void main(String[] args) throws InterruptedException, IOException {
            System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.freepdfconvert.com/pdf-to-word");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//span[contains(text(),'Choose PDF file')]")).click();
            Thread.sleep(1000);
            Runtime run = Runtime.getRuntime();
            run.exec("C:\\Users\\tkharma\\Documents\\FileUpload2.exe");
        }
    }

