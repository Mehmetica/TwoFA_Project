package com.FiveFA_websites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OK_Coinbase2 {

    public static void main(String[] args) throws InterruptedException {

    }public void coinbase() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");


        //sitye gidiş
        driver.get("https://login.coinbase.com/signin");
        driver.manage().window().maximize();


        Thread.sleep(2000);
        //mail adresi kutusuna tıkla
        driver.findElement(By.xpath("//input[@data-testid='input-username']")).click();
        Thread.sleep(1500);
        //mail adresi gir
        driver.findElement(By.xpath("//input[@data-testid='input-username']")).sendKeys(Objects2.eMail);
        Thread.sleep(1500);

        WebDriverWait wait = new WebDriverWait(driver,5);
        WebElement devam = driver.findElement(By.xpath("//span[text()='Devam et' or text()='Continue']"));
        wait.until(ExpectedConditions.elementToBeClickable(devam)).click();


        Thread.sleep(3000);
        //şifre kutusuna tıkla
        driver.findElement(By.xpath("//input[@type='password']")).click();
        Thread.sleep(3000);

        //şifre gir
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Besiktas01!Besiktas01!");
        Thread.sleep(2500);




        //login butonuna tıkla
        driver.findElement(By.xpath("//span[text()='Devam et' or text()='Continue']")).click();


    }
}
