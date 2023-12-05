package com.magento.softwaretestingboard.testsuite;

import com.magento.softwaretestingboard.pages.GearPage;
import com.magento.softwaretestingboard.testbase.BaseTest;
import org.testng.annotations.Test;


public class GearTest extends BaseTest {
    GearPage gearPage = new GearPage();

    @Test
    public void userShouldAddProductSuccessfullyToShoppingCart() {


        gearPage.mouseHoverOnGearMenu();
        gearPage.clickOnBags();
        gearPage.clickOnOverNightDuffle();
        gearPage.getTextFromOvernightDuffle();
        gearPage.sendTextToChangeQty("3");
        gearPage.clickOnAddToCartButton();
        gearPage.verifyTheAddedShoppingText();
        gearPage.clickOnShoppingCartLinkIntoMessage();
        gearPage.getTextToVerifyProductOverNightDuffle();
        gearPage.getTextToVerifyQuantityIs3();
        gearPage.getTextToVerifyProductPrice135();
        gearPage.sendTextToVerifyProductPrice135("quantity1");
        gearPage.clickOnUpdateShoppingCartButton();
        gearPage.verifyTheProductprice225();

    }
}
