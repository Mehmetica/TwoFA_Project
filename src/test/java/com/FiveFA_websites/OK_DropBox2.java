package com.FiveFA_websites;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class OK_DropBox2 {
    public static void main(String[] args) throws InterruptedException {

        OK_DropBox2 dr= new OK_DropBox2();
        dr.dropbox();

    }public void dropbox()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:/Users/Mehmet G/Selenium/Chrome Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.dropbox.com/login?src=logout");
        driver.manage().window().maximize();
        Thread.sleep(500);

        driver.findElement(By.xpath("//input[@class='text-input-input']")).click();
        Thread.sleep(1500);


        driver.findElement(By.xpath("//input[@name='login_email']")).sendKeys(Objects2.eMail);
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='login_password']")).sendKeys(Objects2.password);
        Thread.sleep(500);
        driver.findElement(By.xpath("//button[@class='login-button signin-button button-primary' or " +
                "@class='login-button--dwg-refresh dwg-button2 dwg-button2--button-style-primary dwg-box dwg-display--inline-flex" +
                " dwg-position--relative dwg-pt--2 dwg-pr--3 dwg-pb--2 dwg-pl--3 dwg-bg-color--core-accent disabled:dwg-bg-color--disabled" +
                " dwg-border-style--none dwg-color--inverse-standard disabled:dwg-color--inverse-faint dwg-text-decoration--none dwg-align-" +
                "items--center dwg-justify-content--center']")).click();




    }
}

