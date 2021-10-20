package com.morningstar.seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://nervgh.github.io/pages/angular-file-upload/examples/simple");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@multiple='']")).sendKeys("C:\\Users\\tkharma\\Downloads");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@ng-click=\"item.upload()\"]")).click();
        Thread.sleep(2000);
        //driver.close();

    }
}






