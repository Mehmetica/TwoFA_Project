package com.FiveFA_websites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class OK_Unity {

    public void unity() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");
        //sitye gidiş


        System.out.println("----------------------------------------");
        //sitye gidiş
        driver.get("https://unity.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("(//span[@class='component-icon component-button__icon--is-standalone'])[3]")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("(//li[@class='component-menu-item'])[8]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("conversations_create_session_form_email")).sendKeys(Objects2.eMail);
        Thread.sleep(2000);
        driver.findElement(By.id("conversations_create_session_form_password")).sendKeys(Objects2.password);
        Thread.sleep(1000);

        driver.findElement(By.name("commit")).click();

        driver.close();

    }
}
