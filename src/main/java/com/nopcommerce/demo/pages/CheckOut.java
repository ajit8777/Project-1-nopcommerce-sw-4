package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOut extends Utility {


    By firstName = By.id("BillingNewAddress_FirstName");
    By lastName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address1 = By.id("BillingNewAddress_Address1");
    By zipPostalCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By radioButton = By.id("shippingoption_1");
    By continueButton2 = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By creditCardRadioButton = By.id("paymentmethod_1");
    By continueButton3 = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By masterCard = By.xpath("//select[@id='CreditCardType']");
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expirationMonth = By.id("ExpireMonth");
    By expirationYear = By.id("ExpireYear");
    By cardCode = By.id("CardCode");
    By continueButtonBelowCardDetails = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By paymentMethodText = By.xpath("//li[@class='payment-method']");
    By shippingMethodText = By.xpath("//li[@class='shipping-method']");
    By totalPrice = By.xpath("//tr[@class='order-total']//span[@class='value-summary']");
    By confirmButton = By.xpath("//button[normalize-space()='Confirm']");
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    By orderProcessedText = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButtonOnOrderPage = By.xpath("//button[normalize-space()='Continue']");

    By secondDayRadioButton = By.id("shippingoption_2");


    public void fillAllMandatoryField() {

        sendTextToElement(firstName, "Tesco");
        sendTextToElement(lastName, "Extra");
        sendTextToElement(email, "tesco456@gmail.com");
        selectByValueFromDropDown(country, "233");
        sendTextToElement(city, "Harrow");
        sendTextToElement(address1, "100, close Avenue");
        sendTextToElement(zipPostalCode, "HA3 GHH");
        sendTextToElement(phoneNumber, "07896541230");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirRadioButton() {
        clickOnElement(radioButton);
    }

    public void clickOnContinueButtonBelowNextDayAirRadioButton() {
        clickOnElement(continueButton2);
    }

    public void clickOnCreditCardRadioButton() {
        clickOnElement(creditCardRadioButton);
    }

    public void clickOnContinueButtonBelowCreditCard() {
        clickOnElement(continueButton3);
    }

    public void selectMasterCardFromDropdown() {
        selectByValueFromDropDown(masterCard, "MasterCard");
    }
    public void fillingCreditCardDetails(){
        sendTextToElement(cardHolderName, "Tesco Extra");
        sendTextToElement(cardNumber, "5585478547852145");
        selectByValueFromDropDown(expirationMonth, "11");
        selectByValueFromDropDown(expirationYear, "2025");
        sendTextToElement(cardCode, "456");
    }
    public void clickOnContinueButtonBelowCreditCardDetails(){
        clickOnElement(continueButtonBelowCardDetails);
    }
    public String getPaymentMethodText(){
        return getTextFromElement(paymentMethodText);
    }
    public String getShippingMethodText(){
        return getTextFromElement(shippingMethodText);
    }
    public String getTotalPriceText(){
        return getTextFromElement(totalPrice);
    }
    public void clickOnConfirmButton(){
        clickOnElement(confirmButton);
    }
    public String getThankYouText(){
        return getTextFromElement(thankYouText);
    }
    public String getOrderProcessedText(){
        return getTextFromElement(orderProcessedText);
    }
    public void clickOnContinueButtonOnOrderPage(){
        clickOnElement(continueButtonOnOrderPage);
    }
    public void clickOnSecondDayAirRadioButton() {
        clickOnElement(secondDayRadioButton);
    }
    public void selectVisaCardFromDropdown() {
        selectByValueFromDropDown(masterCard, "Visa");
    }


}
