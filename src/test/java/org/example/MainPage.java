package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class MainPage extends WebDriverElements {

    public static WebDriver driver;

    public void setupChrome() {
        WebDriverManager.chromedriver().driverVersion("98.0.4758.102").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }

    public void setupFireFox() {
        driver =  new FirefoxDriver();;
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
    }

    public void gotoDomain(String url){
        driver.get(url);
    }

    public boolean checkUrl(String url){
        if(driver.getCurrentUrl().contains(url)){
            return true;
        }
        takeSnapShot();
        return false;
    }

    public boolean checkVisibleElement(By by){
        if(driver.findElement(by).isDisplayed()){
            return true;
        }
        else{
            takeSnapShot();
            return false;
        }
    }

    public void wait(int miliseconds){
        try {
            int secods = miliseconds * 1000;
            Thread.sleep(secods);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void takeSnapShot() {
        try {
            TakesScreenshot scrShot =((TakesScreenshot)driver);
            File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
            File DestFile=new File(".\\\\screenshot\\\\Defect.jpg");
            FileUtils.copyFile(SrcFile, DestFile);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
