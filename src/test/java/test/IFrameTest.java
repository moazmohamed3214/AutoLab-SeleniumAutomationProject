package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.IFramePage;

public class IFrameTest extends Base {



    @Test
    public void testClickButtonInFirstFrame() {
        home.clickIFramePage();
        IFramePage page = new IFramePage(driver);
        page.clickButtonInFirstFrame();
        Assert.assertTrue(page.isSuccessMessageDisplayedIFrame1(), "Success message not displayed after clicking in first iframe.");
    }

    @Test
    public void testClickButtonInSecondFrame() {
        home.clickIFramePage();
        IFramePage page = new IFramePage(driver);
        page.clickButtonInSecondFrame();
        Assert.assertTrue(page.isSuccessMessageDisplayedIFrame2(), "Success message not displayed after clicking in second iframe.");
    }
}
