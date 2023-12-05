package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ComputerTest extends TestBase {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    ShoppingCart shoppingCart = new ShoppingCart();
    SignInPage signInPage = new SignInPage();
    CheckOut checkOut = new CheckOut();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        // 1.1 Click on Computer Menu.
        homePage.clickOnComputersMenu();
        // 1.2 Click on Desktop
        homePage.clickOnDesktops();
        // 1.3 Select Sort By position "Name: Z to A"
        desktopsPage.sortByPositionZToA();
        //1.4 Verify the Product will arrange in Descending order.

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        // 1.1 Click on Computer Menu.
        homePage.clickOnComputersMenu();

        // 1.2 Click on Desktop
        homePage.clickOnDesktops();

        // 1.3 Select Sort By position "Name: A to Z"
        desktopsPage.sortByPositionAToZ();
        Thread.sleep(5000);

        // 2.4 Click on "Add To Cart"
        desktopsPage.clickOnAddToCart();

        // 2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = buildYourOwnComputer.getProductNameText();
        Assert.assertEquals(expectedText, actualText, "Name does not match");

        // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildYourOwnComputer.selectProcessorFromDropdown();

        //2.7.Select "8GB [+$60.00]" using Select class.
        buildYourOwnComputer.selectRamFromDropdown();

        //2.8 Select HDD radio "400 GB [+$100.00]"
        buildYourOwnComputer.clickOnRadioButtonOfHDD();

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        buildYourOwnComputer.clickOnRadioButtonOfOS();

        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        buildYourOwnComputer.clickOnSoftwareCheckbox();

        //2.11 Verify the price "$1,475.00"
        String expectedPrice = "$1,475.00";
        String actualPrice = buildYourOwnComputer.getTotalPriceText();
        Assert.assertEquals(actualPrice, expectedPrice, "Total Price does not match");

        // 2.12 Click on "ADD TO CARD" Button.
        buildYourOwnComputer.addProductToCart();

        //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = buildYourOwnComputer.getContentMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Content Message does not match");

        //After that close the bar clicking on the cross button.
        buildYourOwnComputer.closingContentMessageBar();

        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildYourOwnComputer.mouseHoverToShoppingCart();
        Thread.sleep(3000);
        buildYourOwnComputer.mouseHoverToGoToCartAndClick();

        //2.15 Verify the message "Shopping cart"
        String expectedText1 = "Shopping cart";
        String actualText1 = shoppingCart.getTextOfShoppingCart();
        Assert.assertEquals(actualText1, expectedText1, "Shopping Cart text does not match");

        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCart.addQtyAndUpdateShoppingCart();

        //2.17 Verify the Total"$2,950.00"
        String expectedText2 = "$2,950.00";
        String actualText2 = shoppingCart.getTotalPriceText();
        Assert.assertEquals(actualText2, expectedText2, "Total price does not match");

        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCart.clickOnTermsAndServiceCheckbox();

        //2.19 Click on “CHECKOUT”
        shoppingCart.clickOnCheckoutButton();

        //2.20 Verify the Text “Welcome, Please Sign In!”
        String expectedText3 = "Welcome, Please Sign In!";
        String actualText3 = signInPage.getWelcomeText();
        Assert.assertEquals(actualText3, expectedText3, "Welcome text does not match");

        //2.21Click on “CHECKOUT AS GUEST” Tab
        signInPage.clickOnCheckOutAsGuestButton();

        //2.22 Fill the all mandatory field
        checkOut.fillAllMandatoryField();

        //2.23 Click on “CONTINUE”
        checkOut.clickOnContinueButton();

        //2.24 Click on Radio Button “Next Day Air($0.00)”
        checkOut.clickOnNextDayAirRadioButton();

        //2.25 Click on “CONTINUE”
        checkOut.clickOnContinueButtonBelowNextDayAirRadioButton();

        //2.26 Select Radio Button “Credit Card”
        checkOut.clickOnCreditCardRadioButton();
        Thread.sleep(2000);
        checkOut.clickOnContinueButtonBelowCreditCard();

        //2.27 Select “Master card” From Select credit card dropdown
        checkOut.selectMasterCardFromDropdown();

        //2.28 Fill all the details
        checkOut.fillingCreditCardDetails();

        //2.29 Click on “CONTINUE”
        checkOut.clickOnContinueButtonBelowCreditCardDetails();

        //2.30 Verify “Payment Method” is “Credit Card”
        String expectedText4 = "Payment Method: Credit Card";
        String actualText4 = checkOut.getPaymentMethodText();
        Assert.assertEquals(actualText4, expectedText4, "Payment Method text does not match");

        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expectedText5 = "Shipping Method: Next Day Air";
        String actualText5 = checkOut.getShippingMethodText();
        Assert.assertEquals(actualText5, expectedText5, "Shipping Method text not matching");

        //2.33 Verify Total is “$2,950.00”
        String expectedText6 = "$2,950.00";
        String actualText6 = checkOut.getTotalPriceText();
        Assert.assertEquals(actualText6, expectedText6, "Total Price not matching");

        //2.34 Click on “CONFIRM”
        checkOut.clickOnConfirmButton();

        //2.35 Verify the Text “Thank You”
        String expectedText7 = "Thank you";
        String actualText7 = checkOut.getThankYouText();
        Assert.assertEquals(actualText7, expectedText7, "Thank you text not matching");

        //2.36 Verify the message “Your order has been successfully processed!”
        String expectedText8 = "Your order has been successfully processed!";
        String actualText8 = checkOut.getOrderProcessedText();
        Assert.assertEquals(actualText8, expectedText8, "Message not matching");

        //2.37 Click on “CONTINUE”
        checkOut.clickOnContinueButtonOnOrderPage();

        //2.37 Verify the text “Welcome to our store”
        String expectedText9 = "Welcome to our store";
        String actualText9 = homePage.getWelcomeMessageText();
        Assert.assertEquals(actualText9, expectedText9, "Welcome Message not matching");


    }
}
