package com.FiveFA_websites;

import com.websites.Objects;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_Redis {
    public   void redis() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
//        driver.get("https://account.oncehub.com/signin?login_challenge=ddc2fee67d274c8da59daa7e9b28c875");
//        driver.manage().window().maximize();
//        driver.findElement(By.id("email")).sendKeys(Objects.eMail);
//        driver.findElement(By.id("password")).sendKeys(Objects.password);
//        Thread.sleep(1000);
//        driver.findElement(By.id("signIn")).click();




        //sayfaya gitme
        driver.get("https://app.redislabs.com/?_gl=1*1vejvx6*_ga*MTQ4OTc5MjYuMTY2OTk2Mjc3Mg..*_ga_8BKGRQKRPV*MTY3MDUwNjIwNC4zLjAuMTY3MDUwNjIwNC4wLjAuMA..#/login");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("textfield--email")).sendKeys(Objects.eMail);
        Thread.sleep(1000);
        //driver.findElement(By.xpath("//input[@data-test-id='login-username']")).click();
        driver.findElement(By.name("password")).sendKeys(Objects.password);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@data-testid='button--submit']")).click();








//input[@placeholder='Şifre']


    }
}
