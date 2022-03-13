package org.example;
import org.openqa.selenium.By;

public class DemoRequestPage extends MainPage {

    public void clickDemoRequest(){
        driver.findElement(btnPopup).click();
        wait(1);
    }

    public void setName(String name){
        driver.findElement(txtName).sendKeys(name);
        wait(1);
    }

    public void setSurname(String surname){
        driver.findElement(txtSurname).sendKeys(surname);
        wait(1);
    }

    public void setEmail(String email){
        driver.findElement(txtEmail).sendKeys(email);
        wait(1);
    }

    public void setInstituation(String instituation) {
        driver.findElement(txtInstituation).sendKeys(instituation);
        wait(1);
    }

    public void setTitle(String title) {
        driver.findElement(txtTitle).sendKeys(title);
        wait(1);
    }

    public void setPhone(String phone) {
        driver.findElement(txtPhone).sendKeys(phone);
        wait(1);
    }

    public void setProduct(String product) {
        String setVariable = "//*[@id='konu']/*[text()='"+product+"']";
        driver.findElement(cboProduct).click();
        wait(2);
        driver.findElement(By.xpath(setVariable)).click();
        wait(1);
    }

    public void setMessage(String message) {
        driver.findElement(txtMessage).sendKeys(message);
        wait(1);
    }

    public void clickKvkk() {
        driver.findElement(txtKvkk).click();
        wait(1);
    }


    public void clickContracts() {
        driver.findElement(txtCampaing).click();
        wait(1);
    }

    public void clickSend(){
        driver.findElement(btnSend).click();
        driver.quit();
    }
}
