package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class Register extends Utility {
    By registerText = By.cssSelector("div[class='page-title'] h1");
    By firstNameField = By.id("FirstName");
    By lastNameField = By.name("LastName");
    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By confirmPasswordField = By.id("ConfirmPassword");
    By registerButton = By.id("register-button");
    By registrationText = By.xpath("//div[@class='result']");
    By continueTab = By.xpath("//a[normalize-space()='Continue']");


    public String getRegisterText() {
        return getTextFromElement(registerText);
    }
    public void enterFirstName(String name){
        sendTextToElement(firstNameField, name);
    }
    public void enterLastName(String name){
        sendTextToElement(lastNameField, name);
    }
    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }
    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField, confirmPassword);
    }
    public void clickRegisterButton(){
        clickOnElement(registerButton);
    }
    public String getRegistrationText(){
        return getTextFromElement(registrationText);
    }
    public void clickOnContinueTab(){
        clickOnElement(continueTab);
    }
}
