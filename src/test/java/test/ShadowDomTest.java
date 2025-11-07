package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.ShadowDomPage;

public class ShadowDomTest extends Base {



    @Test
    public void testOutsideShadowDomMessageIsDisplayed() {
        home.clickShadowDomPage();
        ShadowDomPage page = new ShadowDomPage(driver);
        Assert.assertTrue(page.isOutsideShadowDomMessageDisplayed(),
                "Outside Shadow DOM message is not displayed!");
    }

    @Test
    public void testHelloShadowDomMessageIsDisplayed() {
        home.clickShadowDomPage();
        ShadowDomPage page = new ShadowDomPage(driver);
        Assert.assertTrue(page.isHelloShadowDomMessageDisplayed(),
                "Hello Shadow DOM message is not displayed!");
    }
}
