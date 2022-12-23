package com.FiveFA_websites;

import com.websites.Objects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Half_Gate2 {

    public static void main(String[] args) throws InterruptedException {

    } public void gate() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");
        //sitye gidiş
        driver.get("https://www.gate.io/tr/login");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='E-posta']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='E-posta']")).sendKeys(Objects.eMail);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='En az 8 karakter uzunluğunda']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//input[@placeholder='En az 8 karakter uzunluğunda']")).sendKeys(Objects.password);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//span[@class='mantine-qo1k2 mantine-Button-label']")).click();
        Thread.sleep(3000);











    }
}
