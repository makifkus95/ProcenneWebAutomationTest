package org.example;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;

public class DemoqaPage extends MainPage{


    public void clickJoinNow() {
        driver.findElement(btnHomeBanner).click();
    }

    public void switchToWindow() {
        wait(7);
        ArrayList tabs = new ArrayList (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1).toString());
        driver.findElement(btnModalClose).click();
    }

    public void clickGoToRegistration() {
        driver.findElement(btnGotoRegistration).click();
        wait(2);
        JavascriptExecutor Scrool = (JavascriptExecutor) driver;
        Scrool.executeScript("window.scrollBy(0,-300)", "");
        Assert.assertTrue("Registration Butonuna tıklanmadı.",checkVisibleElement(btnSend));
    }

    public void setFirstName(String firstName) {
        driver.findElement(txtFirstName).sendKeys(firstName);
        wait(1);
    }

    public void setLastName(String lastName) {
        driver.findElement(txtLastName).sendKeys(lastName);
        wait(1);
    }

    public void setMobil(String mobil) {
        driver.findElement(txtMobile).sendKeys(mobil);
        wait(1);
    }

    public void selectCountry(String country) {
        driver.findElement(cboCountry).sendKeys(country);
        wait(1);
    }

    public void setCity(String city) {
        driver.findElement(txtCity).sendKeys(city);
        wait(1);
    }

    public void setYourMessage(String message) {
        driver.findElement(txtToolsMessage).sendKeys(message);
        wait(1);
    }
}
