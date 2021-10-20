package com.morningstar.seleniumdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ConfirmationPopup {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        //alertpopup
        driver.findElement(By.id("alertBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        //confirmation popup
        driver.findElement(By.id("confirmBox")).click();
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        //promptAlert
        driver.findElement(By.id("promptBox")).click();
        Alert promptalert = driver.switchTo().alert();
        Thread.sleep(2000);
        promptalert.sendKeys("teju");
        promptalert.accept();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("output")).getText());
    }
}












