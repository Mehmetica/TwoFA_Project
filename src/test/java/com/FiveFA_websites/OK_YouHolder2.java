package com.FiveFA_websites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OK_YouHolder2 {
    public void youholder()throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.youhodler.com/sign-in");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@data-testid='EMAIL_INPUT']")).sendKeys(Objects2.eMail);
        driver.findElement(By.xpath("//input[@data-testid='PASSWORD_INPUT']")).sendKeys(Objects2.password);
        driver.findElement(By.xpath("//div[@data-testid='SIGN_IN_BUTTON']")).click();


        driver.close();



    }
}
