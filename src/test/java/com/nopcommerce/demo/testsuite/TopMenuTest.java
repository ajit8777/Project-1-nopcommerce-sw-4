package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    //Method name select Menu with menu parameter
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = homePage.getAllTopManuName();

        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = homePage.getAllTopManuName();
        }
    }


    @Test
    //verify the page navigation
    public void verifyPageNavigation () {
        selectMenu("Books");
        Assert.assertEquals(homePage.getTitleOfPage(), "Books", "Page Navigated Successfully");

}





       }






