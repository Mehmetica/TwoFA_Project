package com.FiveFA_websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Cex2 {

    public static void main(String[] args) throws InterruptedException {



    } public void cex() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //sayfaya gitme
        driver.get("https://profile.cex.io/authorization/login");
        driver.manage().window().maximize();


        driver.findElement(By.id("email")).sendKeys(Objects2.eMail);
        driver.findElement(By.id("password")).sendKeys(Objects2.password);
        driver.findElement(By.id("login_start")).click();

        driver.close();
    }
}
