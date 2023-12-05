package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhones extends Utility {

    By listViewTab = By.xpath("//a[normalize-space()='List']");
    By nokiaLumia1020 = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");
    By cellPhoneText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By priceText$349 = By.id("price-value-20");
    By changeQty = By.id("product_enteredQuantity_20");
    By addToCart = By.id("add-to-cart-button-20");
    By shoppingCartMessage = By.xpath("//p[@class='content']");
    By contentBar = By.xpath("//span[@title='Close']");
    By shoppingCart = By.xpath("//span[@class='cart-label']");
    By goToCart = By.xpath("//button[normalize-space()='Go to cart']");




    public void clickOnListViewTab(){
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumia1020(){
        clickOnElement(nokiaLumia1020);
    }

    public String getCellPhonesText(){
        return getTextFromElement(cellPhoneText);
    }
    public String getPriceTextOfCellPhone(){
        return getTextFromElement(priceText$349);
    }
    public void addQtyAndUpdateShoppingCart() {
        deleteTextOnElement(changeQty);
        sendTextToElement(changeQty, "2");

    }
    public void clickOnAddToCart(){
        clickOnElement(addToCart);
    }
    public String getShoppingCartMessage(){
        return getTextFromElement(shoppingCartMessage);
    }
    public void closingContentMessageBar() {
        clickOnElement(contentBar);
    }
    public void mouseHoverToShoppingCart(){
        mouseHoverToElement(shoppingCart);
    }
    public void mouseHoverToGoToCartAndClick(){
        mouseHoverToElementAndClick(goToCart);
    }

}
