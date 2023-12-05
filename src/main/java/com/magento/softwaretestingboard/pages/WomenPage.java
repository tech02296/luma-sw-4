package com.magento.softwaretestingboard.pages;

import com.magento.softwaretestingboard.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {
    By womenMenu =  By.xpath("//a[@id='ui-id-4']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jackets = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");
    By sort = By.xpath("(//select[@id='sorter'])[1]");

    public void mouseHoverOnWomenMenu(){

        mouseHoverToElement(womenMenu);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }
    public void clickOnJacket(){
        mouseHoverToElementAndClick(jackets);
    }
    public void sortByFilter(String filter){
        selectByVisibleTextFromDropDown(sort, filter);
    }





}

