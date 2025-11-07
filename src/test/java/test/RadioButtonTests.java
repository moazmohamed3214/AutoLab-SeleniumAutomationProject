package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.RadioButtonPage;

public class RadioButtonTests extends Base {



    @Test(priority = 1)
    public void testSelectMaleRadioButton() {
        home.clickRadioButton();
        RadioButtonPage page = new RadioButtonPage(driver);
        page.selectMaleRadioButton();
        page.clickShowSelectedGenderButton();
        Assert.assertTrue(page.isMaleSelectionMessageDisplayed(),
                " The 'You selected: Male' message was not displayed!");
    }

    @Test(priority = 2)
    public void testEnabledRadioButton() {
        home.clickRadioButton();
        RadioButtonPage page = new RadioButtonPage(driver);
        page.selectEnabledRadioButton1();
        Assert.assertTrue(page.isRadioButton1Enabled(),
                " The enabled radio button should be clickable but isn’t!");
    }

    @Test(priority = 3)
    public void testDisabledRadioButton() {
        home.clickRadioButton();
        RadioButtonPage page = new RadioButtonPage(driver);
        Assert.assertTrue(page.isDisabledRadioButtonInactive(),
                " The disabled radio button should not be clickable!");
    }

    @Test(priority = 4)
    public void testSelectGenderAndAgeGroup() {
        RadioButtonPage page = new RadioButtonPage(driver);
        page.selectMaleInGenderGroup();
        page.selectUnder18AgeGroup();
        page.clickShowSelectedValuesButton();

        Assert.assertTrue(page.isSelectedValuesMessageCorrect(),
                " The selected gender and age group message is incorrect!");
    }
}
