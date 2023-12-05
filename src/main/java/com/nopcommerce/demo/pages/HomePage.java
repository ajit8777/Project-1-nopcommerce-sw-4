package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {


    By computersMenu = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By desktops = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']");
    By electronicsTab = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By cellPhones = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By cellPhonesText = By.xpath("//h1[normalize-space()='Cell phones']");
    By welcomeText = By.xpath("//div[@class='page-title']/h1");
    By logOut = By.xpath("//a[normalize-space()='Log out']");
    By productName = By.xpath("//div[@class='item-grid']//h2");
    By getAllTopManuName = By.xpath("//ul[@class='top-menu notmobile']//li");
    By pageTitle = By.xpath("//div[@class='page-title']");


    public void clickOnComputersMenu() {
        mouseHoverToElement(computersMenu);
    }

    public void clickOnDesktops() {
        mouseHoverToElementAndClick(desktops);
    }


    public void selectMenu(String menu) {
        clickOnElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='" + menu + "']"));
    }

    //get product name without filter
    public List<WebElement> getProductNameWithoutFilter() {
        List<WebElement> getProductName = driver.findElements(productName);
        return getProductName;
    }

    public String getTitleOfPage() {
        return getTextFromElement(pageTitle);
    }

    public void clickOnElectronicsTab() {
        mouseHoverToElement(electronicsTab);
    }

    public void clickOnCellPhones() {
        mouseHoverToElementAndClick(cellPhones);
    }

    public String getCellPhonesText() {
        return getTextFromElement(cellPhonesText);
    }

    public String getWelcomeMessageText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnLogOutButton() {
        clickOnElement(logOut);
    }

    public List<WebElement> getAllTopManuName() {
        List<WebElement> getListOfElements = driver.findElements(getAllTopManuName);
        return getListOfElements;
    }
}


