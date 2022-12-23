package com.FiveFA_websites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Mongo {

    public static void main(String[] args) throws InterruptedException {

    } public void mongo() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");
        //sitye gidiş
        driver.get("https://account.mongodb.com/account/login?_ga=2.184417326.921531452.1671797766-1695759563.1669979850");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys(Objects2.eMail);
        Thread.sleep(1000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys(Objects2.password);
        Thread.sleep(1000);

        driver.findElement(By.name("login")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("send" )).click();




    }
}
