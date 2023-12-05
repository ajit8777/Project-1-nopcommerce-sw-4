package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    By checkOutAsGuest = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By registerTab = By.xpath("//button[normalize-space()='Register']");



    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckOutAsGuestButton(){
        clickOnElement(checkOutAsGuest);
    }
    public void clickOnRegisterButton(){
        clickOnElement(registerTab);
    }






}
