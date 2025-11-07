package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.Home;

public class DropDownTest extends Base {


    @Test
    public void testSelectFruitFromDropdown() {
        home.clickDropDownPage();
        DropDownPage page = new DropDownPage(driver);
        page.selectedFruit = "Banana";
        page.selectFruitFromDropdown();
        Assert.assertTrue(page.isFruitSelectionMessageDisplayed(), " Fruit selection message not displayed correctly!");
    }

    @Test
    public void testSelectMultipleCountries() {
        home.clickDropDownPage();
        DropDownPage page = new DropDownPage(driver);
        page.selectTwoCountries();
        Assert.assertTrue(page.areFirstAndLastCountryMessagesDisplayed(), " Country selection messages not displayed correctly!");
    }
}
