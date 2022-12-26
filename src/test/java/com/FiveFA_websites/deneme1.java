package com.FiveFA_websites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class deneme1 {

    public static void main(String[] args) throws InterruptedException {
         new deneme1().deneme();

    } public void deneme() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");
        //sitye gidiş
        driver.get("https://www.icloud.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//ui-button[@class='push primary sign-in-button']")).click();

        WebDriverWait wait1 = new WebDriverWait(driver,5);

        WebElement element1= driver.findElement(By.id("account_name_text_field"));
        wait1.until(ExpectedConditions.elementToBeClickable(element1)).sendKeys(Objects2.eMail);

        driver.findElement(By.id("account_name_text_field")).sendKeys(Objects2.eMail);
        Thread.sleep(1000);
        driver.findElement(By.id("sign-in")).click();
        Thread.sleep(1500);
        driver.findElement(By.id("password_text_field")).sendKeys(Objects2.password);
        Thread.sleep(1000);
        driver.findElement(By.id("sign-in")).click();





















    }
}
