package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.WomenPage;
import com.magento.softwaretestingboard.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {
    WomenPage homePage = new WomenPage();

    @Test

    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        // Mouse Hover on WomenMenu
        homePage.mouseHoverOnWomenMenu();
        Thread.sleep(3000);

        // Mouse Hover on Tops
        homePage.mouseHoverOnTops();
        Thread.sleep(3000);

        //Click On Jackets
        homePage.clickOnJacket();
        Thread.sleep(3000);

        //Jackets storing in name list
        List<WebElement>jacketElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketNameListBefore = new ArrayList<>();
        for (WebElement lists: jacketElementsList) {
            jacketNameListBefore.add(lists.getText());
            Thread.sleep(3000);

        }

        // Select Sort by filter Product Name
        homePage.sortByFilter("Product Name");
        Thread.sleep(3000);

        // Verify the products name display in alphabetical order
        jacketElementsList = driver.findElements(By.xpath("//strong[@class='product name product-item-name']//a"));
        List<String> jacketNameListAfter = new ArrayList<>();
        for (WebElement images  : jacketElementsList) {
            jacketNameListAfter.add(images.getText());

        }

        // Sort by Ascending order
        jacketNameListBefore.sort(String.CASE_INSENSITIVE_ORDER);

        // Verify the products name display in alphabetical order
        Assert.assertEquals(jacketNameListBefore,jacketNameListAfter);
    }


       @Test
       public void verifyTheSortByPriceFilter() throws InterruptedException {

           //Mouse Hover on Women Menu
           homePage.mouseHoverOnWomenMenu();
           Thread.sleep(3000);

           //Mouse Hover on Tops
           homePage.mouseHoverOnTops();
           Thread.sleep(3000);

           //Click on Jackets
           homePage.clickOnJacket();
           Thread.sleep(3000);

           // Storing jackets price in list
           List<WebElement> jacketPriceElementList = driver.findElements(By.xpath("//div[normalize-space()='Price']"));
           List<Double> jacketPriceListBefore = new ArrayList<>();
           for (WebElement money : jacketPriceElementList) {
               //Removing $ from the price and converting price in to Double
               jacketPriceListBefore.add(Double.valueOf(money.getText().replace("$","")));

           }

           // Select Sort By filter Price
           homePage.sortByFilter("price");
           Thread.sleep(3000);

           // After Sorting Products by Price
           jacketPriceElementList = driver.findElements(By.xpath("//div[normalize-space()='Price']"));
           List<Double> jacketsPriceListAfter = new ArrayList<>();
           Thread.sleep(1000);
           for (WebElement value : jacketPriceElementList) {
               //Converting price in to Double and Removing $ from price
               jacketsPriceListAfter.add(Double.valueOf(value.getText().replace("$", "")));
           }
           // Sort the jacketPriceListBefore to Ascending Order
           Collections.sort(jacketPriceListBefore);
           // Verify the products price display in Low to High

           Assert.assertEquals(jacketPriceListBefore, jacketsPriceListAfter);
    }
}



