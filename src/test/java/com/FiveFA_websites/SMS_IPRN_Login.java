package com.FiveFA_websites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SMS_IPRN_Login {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


//----------------------------------------------------------------------------------------------
        ChromeOptions options = new ChromeOptions();

        options.addArguments("start-maximized");

        options.addArguments("disable-infobars");

        options.addArguments("--disable-extensions");


        driver.navigate().to("http://198.244.188.178/ints/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("Mehmetg");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Mehmetg");



        try {
            WebElement captcha = driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']"));

            new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(captcha));

            new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(captcha)).click();
        } catch (Exception e) {
            e.getMessage();
        }


        WebElement loginButton = driver.findElement(By.tagName("button"));
        loginButton.click();


    }
}
