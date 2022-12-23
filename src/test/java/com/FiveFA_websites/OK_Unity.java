package com.FiveFA_websites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Unity {

    public void unity() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        System.out.println("----------------------------------------");
        //sitye gidiş


            System.out.println("----------------------------------------");
            //sitye gidiş
            driver.get("https://id.unity.com/en/conversations/73c0545c-970e-423f-bd0d-24539d19891c01bf");
            driver.manage().window().maximize();

            driver.findElement(By.id("conversations_create_session_form_email")).sendKeys(Objects2.eMail);
            Thread.sleep(1000);
            driver.findElement(By.id("conversations_create_session_form_password")).sendKeys(Objects2.password);
            Thread.sleep(1000);

            driver.findElement(By.name("commit")).click();



        }
}
