package org.example;

import org.openqa.selenium.By;

public class WebDriverElements {

    By btnPopup = By.className("header-cta");
    By txtName = By.id("firstname");
    By txtSurname = By.id("lastname");
    By txtEmail = By.id("email");
    By txtInstituation = By.id("company");
    By txtTitle = By.id("title");
    By txtPhone = By.id("telephone");
    By cboProduct = By.id("konu");
    By txtKvkk = By.id("kvkk");
    By txtCampaing = By.id("campaing");
    By txtMessage = By.name("message");
    By btnSend = By.xpath("//*[text()='Send']");
    By btnHomeBanner = By.className("home-banner");
    By btnModalClose = By.className("modal__close");
    By btnGotoRegistration = By.xpath("//a[@class='btn btn-primary-shadow btn-block']");
    By txtFirstName = By.id("first-name");
    By txtLastName = By.id("last-name");
    By txtMobile = By.id("mobile");
    By cboCountry = By.id("country");
    By txtCity = By.id("city");
    By txtToolsMessage = By.id("message");
}
