package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class ElectronicsTest extends TestBase {
    HomePage homePage = new HomePage();
    CellPhones cellPhones = new CellPhones();
    ShoppingCart shoppingCart = new ShoppingCart();
    SignInPage signInPage = new SignInPage();
    Register register = new Register();
    CheckOut checkOut = new CheckOut();


    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // 1.1 Mouse Hover on “Electronics” Tab
        homePage.clickOnElectronicsTab();

        //1.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhones();

        //1.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = homePage.getCellPhonesText();
        Assert.assertEquals(actualText, expectedText, "Cell Phones message not matching");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        Random random = new Random();
        int number = random.nextInt(1000);
        // 2.1 Mouse Hover on “Electronics” Tab
        homePage.clickOnElectronicsTab();

        // 2.2 Mouse Hover on “Cell phones” and click
        homePage.clickOnCellPhones();

        // 2.3 Verify the text “Cell phones”
        String expectedText = "Cell phones";
        String actualText = homePage.getCellPhonesText();
        Assert.assertEquals(actualText, expectedText, "Cell Phones message not matching");

        //2.4 Click on List View Tab
        cellPhones.clickOnListViewTab();
        Thread.sleep(5000);

        //2.5 Click on product name “Nokia Lumia 1020” link
        cellPhones.clickOnNokiaLumia1020();

        //2.6 Verify the text “Nokia Lumia 1020”
        String expectedText1 = "Nokia Lumia 1020";
        String actualText1 = cellPhones.getCellPhonesText();
        Assert.assertEquals(actualText1,expectedText1, "Cell phones text not matching");

        //2.7 Verify the price “$349.00”
        String expectedText2 = "$349.00";
        String actualText2 = cellPhones.getPriceTextOfCellPhone();
        Assert.assertEquals(actualText2, expectedText2, "Cell Phone not matching");

        //2.8 Change quantity to 2
        cellPhones.addQtyAndUpdateShoppingCart();

        //2.9 Click on “ADD TO CART” tab
        cellPhones.clickOnAddToCart();

        //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText3 = "The product has been added to your shopping cart";
        String actualText3 = cellPhones.getShoppingCartMessage();
        Assert.assertEquals(actualText3,expectedText3, "Top Green bar message not match");

        //After that close the bar clicking on the cross button.
        cellPhones.closingContentMessageBar();

        //2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        cellPhones.mouseHoverToShoppingCart();
        Thread.sleep(5000);
        cellPhones.mouseHoverToGoToCartAndClick();

        //2.12 Verify the message "Shopping cart"
        shoppingCart.getTextOfShoppingCart();

        //2.13 Verify the quantity is 2
        String expectedTextQty = "2";
        String actualTextQty = shoppingCart.getQuantity();
        Assert.assertEquals(actualTextQty,expectedTextQty, "Quantity is not 2");

        //2.14 Verify the Total $698.00
        String expectedText4 = "$698.00";
        String actualText4 = shoppingCart.getTextOfTotal$698();
        Assert.assertEquals(actualText4, expectedText4, "Total Price not matching");

        //2.15 click on checkbox “I agree with the terms of service”
        shoppingCart.clickOnTermsAndServiceCheckbox();

        //2.16 Click on “CHECKOUT”
        shoppingCart.clickOnCheckoutButton();
        //2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedText5 = "Welcome, Please Sign In!";
        String actualText5 = signInPage.getWelcomeText();
        Assert.assertEquals(actualText5, expectedText5, "Welcome text does not match");

        //2.18 Click on “REGISTER” tab
        signInPage.clickOnRegisterButton();

        //2.19 Verify the text “Register”
        String expectedText6 = "Register";
        String actualText6 = register.getRegisterText();
        Assert.assertEquals(actualText6,expectedText6, "Register text not matching");

        //2.20 Fill the mandatory fields
        register.enterFirstName("Tesco");
        register.enterLastName("Extra");
        register.enterEmailId("tescoextra" + number + "@gmail.com");
        register.enterPassword("Tesco1234");
        register.enterConfirmPassword("Tesco1234");

        //2.21 Click on “REGISTER” Button
        register.clickRegisterButton();

        //2.22 Verify the message “Your registration completed”
        String expectedText7 = "Your registration completed";
        String actualText7 = register.getRegistrationText();
        Assert.assertEquals(actualText7,expectedText7,"Registration Text not matching");

        //2.23 Click on “CONTINUE” tab
        register.clickOnContinueTab();

        //2.24 Verify the text “Shopping card”
        String expectedText8 = "Shopping cart";
        String actualText8 = shoppingCart.getTextOfShoppingCart();
        Assert.assertEquals(actualText8, expectedText8, "Shopping Cart text does not match");

        //2.25 click on checkbox “I agree with the terms of service”
        shoppingCart.clickOnTermsAndServiceCheckbox();

        //2.26 Click on “CHECKOUT”
        shoppingCart.clickOnCheckoutButton();

        //2.27 Fill the Mandatory fields
        checkOut.fillAllMandatoryField();

        //2.28 Click on “CONTINUE”
        checkOut.clickOnContinueButton();
        Thread.sleep(3000);

        //2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkOut.clickOnSecondDayAirRadioButton();

        //2.30 Click on “CONTINUE”
        checkOut.clickOnContinueButtonBelowNextDayAirRadioButton();

        //2.31 Select Radio Button “Credit Card”
        checkOut.clickOnCreditCardRadioButton();
        Thread.sleep(2000);
        checkOut.clickOnContinueButtonBelowCreditCard();

        //2.32 Select “Visa” From Select credit card dropdown
        checkOut.selectVisaCardFromDropdown();

        //2.33 Fill all the details
        checkOut.fillingCreditCardDetails();

        //2.34 Click on “CONTINUE”
        checkOut.clickOnContinueButtonBelowCreditCardDetails();


        //2.35 Verify “Payment Method” is “Credit Card”
        String expectedText9 = "Shipping Method: Next Day Air";
        String actualText9 = checkOut.getShippingMethodText();
        Assert.assertEquals(actualText9, expectedText9, "Shipping Method text not matching");

        //2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedText10 = "Shipping Method: 2nd Day Air";
        String actualText10 = checkOut.getShippingMethodText();
        Assert.assertEquals(actualText10, expectedText10, "Shipping Method text not matching");

        //2.37 Verify Total is “$698.00”
        String expectedText11 = "$2,950.00";
        String actualText11 = checkOut.getTotalPriceText();
        Assert.assertEquals(actualText11, expectedText11, "Total Price not matching");

        //2.38 Click on “CONFIRM”
        checkOut.clickOnConfirmButton();

        //2.39 Verify the Text “Thank You”
        String expectedText12 = "Thank you";
        String actualText12 = checkOut.getThankYouText();
        Assert.assertEquals(actualText12, expectedText12, "Thank you text not matching");

        //2.40 Verify the message “Your order has been successfully processed!”
        String expectedText13 = "Your order has been successfully processed!";
        String actualText13 = checkOut.getOrderProcessedText();
        Assert.assertEquals(actualText13, expectedText13, "Message not matching");

        //2.41 Click on “CONTINUE”
        checkOut.clickOnContinueButtonOnOrderPage();

        //2.42 Verify the text “Welcome to our store”
        String expectedText14 = "Welcome to our store";
        String actualText14 = homePage.getWelcomeMessageText();
        Assert.assertEquals(actualText14, expectedText14, "Welcome Message not matching");

        //2.43 Click on “Logout” link
        homePage.clickOnLogOutButton();

        //2.44 Verify the URL is “https://demo.nopcommerce.com/
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl,"Both Url not matching");
    }
}
