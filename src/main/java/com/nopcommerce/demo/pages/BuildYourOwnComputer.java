package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputer extends Utility {

    By nameText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectProcessor = By.id("product_attribute_1");
    By selectRam = By.id("product_attribute_2");
    By radioButtonOfHDD = By.id("product_attribute_3_7");
    By radioButtonOfOS = By.id("product_attribute_4_9");
    By softwareCheckbox = By.id("product_attribute_5_12");
    By totalPrice = By.xpath("//span[text()='$1,475.00']");
    By addToCart = By.id("add-to-cart-button-1");
    By contentMessage = By.xpath("//p[@class='content']");
    By contentBar = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");



    public String getProductNameText(){
        return getTextFromElement(nameText);
    }

    public void selectProcessorFromDropdown(){
        selectByValueFromDropDown(selectProcessor, "1");
    }
    public void selectRamFromDropdown(){
        selectByValueFromDropDown(selectRam, "5");
    }
    public void clickOnRadioButtonOfHDD(){
        clickOnElement(radioButtonOfHDD);
    }
    public void clickOnRadioButtonOfOS(){
        clickOnElement(radioButtonOfOS);
    }
    public void clickOnSoftwareCheckbox(){
        clickOnElement(softwareCheckbox);
    }
    public String getTotalPriceText(){
        return getTextFromElement(totalPrice);
    }
    public void addProductToCart(){
        clickOnElement(addToCart);
    }
    public String getContentMessage(){
       return getTextFromElement(contentMessage);
    }
    public void closingContentMessageBar(){
        clickOnElement(contentBar);
    }
    public void mouseHoverToShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void mouseHoverToGoToCartAndClick(){
        mouseHoverToElementAndClick(goToCart);
    }
}
