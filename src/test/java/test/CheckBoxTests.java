package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.Home;

public class CheckBoxTests extends Base {


    @Test(priority = 1)
    public void testSingleCheckBoxSelection() {
        home.clickCheckBox();
        CheckBoxPage page = new CheckBoxPage(driver);
        page.clickSingleCheckbox();
        Assert.assertTrue(page.isCheckedMessageDisplayed());
    }

    @Test(priority = 2)
    public void testEnabledCheckboxes() {
        home.clickCheckBox();
        CheckBoxPage page = new CheckBoxPage(driver);
        page.clickEnabledCheckboxes();
        Assert.assertTrue(page.areEnabledCheckboxesActive());
    }

    @Test(priority = 3)
    public void testDisabledCheckboxes() {
        home.clickCheckBox();
        CheckBoxPage page = new CheckBoxPage(driver);
        page.clickDisabledCheckboxes();
        Assert.assertTrue(page.areDisabledCheckboxesInactive());
    }

    @Test(priority = 4)
    public void testToggleAllButton() {
        Home home = new Home(driver);
        home.clickAlert();
        CheckBoxPage page = new CheckBoxPage(driver);
        page.clickToggleAllButton();
        Assert.assertTrue(page.isToggleButtonConvertedToUncheckAll());
    }
}

