package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {

    By productOrderBy = By.id("products-orderby");
    By addToCart = By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[1]");
    public void sortByPositionZToA() {
        selectByValueFromDropDown(productOrderBy, "6");
    }

    public void sortByPositionAToZ() {
        selectByValueFromDropDown(productOrderBy, "5");
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);

    }

    public void getActualText() {


        List actualList = new ArrayList();

        List<WebElement> nameOfProduct = driver.findElements(By.xpath("//h2[@class='product-title']"));

        for (WebElement text : nameOfProduct) {
            String data = text.getText();
            actualList.add(data);

        }
        List expectedList = new ArrayList();
        expectedList.addAll(actualList);
        Collections.sort(expectedList);


    }
}
