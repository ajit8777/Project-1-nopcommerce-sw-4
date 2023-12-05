package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By shoppingCartText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By changeQty = By.xpath("//input[@class='qty-input']");
    //By changeQty2 = By.xpath("")
    By updateCart = By.id("updatecart");
    By totalPrice = By.xpath("//span[@class='product-subtotal']");
    By termsAndService = By.id("termsofservice");
    By checkout = By.id("checkout");
    By total$698Text = By.cssSelector(".product-subtotal");
    By quantity = By.xpath("//input[@class='qty-input']");



    public String getTextOfShoppingCart(){
        return getTextFromElement(shoppingCartText);
    }
    public void addQtyAndUpdateShoppingCart(){
        deleteTextOnElement(changeQty);
        sendTextToElement(changeQty, "2");
        clickOnElement(updateCart);
    }
    public String getTotalPriceText(){
        return getTextFromElement(totalPrice);
    }
    public void clickOnTermsAndServiceCheckbox(){
        clickOnElement(termsAndService);
    }
    public void clickOnCheckoutButton(){
        clickOnElement(checkout);
    }
    public String getTextOfTotal$698(){
        return getTextFromElement(total$698Text);
    }
    public void clickOnTermAndService(){
        clickOnElement(termsAndService);
    }
    public String getQuantity() {
        return driver.findElement(quantity).getAttribute("value");
    }
}

