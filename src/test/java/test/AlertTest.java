package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AlertPage;
import pages.Home;
public class AlertTest extends Base {


    @Test(priority = 1)
    public void testHandleSimpleAlert() {
        home.clickAlert();
        AlertPage page = new AlertPage(driver);
        page.clickShowAlertButton();
        Assert.assertTrue(page.handleAlert(), "Simple alert was not handled correctly.");
    }

    @Test(priority = 2)
    public void testHandleConfirmAlert() {
        home.clickAlert();
        AlertPage page = new AlertPage(driver);
        page.clickShowConfirmButton();
        Assert.assertTrue(page.handleConfirmAlert(), "Confirm alert was not handled correctly.");
    }

    @Test(priority = 3)
    public void testHandlePromptAlert() {
        home.clickAlert();
        AlertPage page = new AlertPage(driver);
        page.clickShowPromptButton();
        Assert.assertTrue(page.handlePromptAlert("Moaz"), "Prompt alert was not handled correctly.");
    }
}
