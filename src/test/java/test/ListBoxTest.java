package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.ListBoxPage;

public class ListBoxTest extends Base {

    @Test(priority = 1)
    public void verifyUserCanAddSingleName() {

        home.clickListBox();

        ListBoxPage page = new ListBoxPage(driver);
        page.selectFromFirstList("Ryan");
        page.clickAddButton();

        Assert.assertTrue(page.isInSecondList("Ryan"), "Ryan should appear in List 2");
        Assert.assertFalse(page.isInFirstList("Ryan"), "Ryan should be removed from List 1");
    }

    @Test(priority = 2)
    public void verifyUserCanAddAllNames() {
        home.clickListBox();

        ListBoxPage page = new ListBoxPage(driver);
        page.clickAddAllButton();

        Assert.assertTrue(page.isInSecondList("Ryan"), "Ryan should be in List 2 after Add All");
        Assert.assertFalse(page.isInFirstList("Ryan"), "Ryan should not remain in List 1 after Add All");
    }

    @Test(priority = 3)
    public void verifyUserCanRemoveSingleName() {

        home.clickListBox();

        ListBoxPage page = new ListBoxPage(driver);
        page.selectFromFirstList("Ryan");
        page.clickAddButton();
        page.selectFromSecondList("Ryan");
        page.clickRemoveButton();

        Assert.assertTrue(page.isInFirstList("Ryan"), "Ryan should return to List 1 after Remove");
        Assert.assertFalse(page.isInSecondList("Ryan"), "Ryan should not remain in List 2 after Remove");
    }

    @Test(priority = 4)
    public void verifyUserCanRemoveAllNames() {

        home.clickListBox();

        ListBoxPage page = new ListBoxPage(driver);
        page.clickAddAllButton();
        page.clickRemoveAllButton();

        Assert.assertTrue(page.isInFirstList("Ryan"), "Ryan should be back in List 1 after Remove All");
    }
}
