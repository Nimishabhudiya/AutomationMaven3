package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Chromecurrys {
    static WebDriver driver;
    public static void main(String[]args){
        System.setProperty("webdriver.chrome.driver","C:\\soft\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.currys.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        driver.close();


    }
}
