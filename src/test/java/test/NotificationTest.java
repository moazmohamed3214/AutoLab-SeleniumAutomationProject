package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.IFramePage;
import pages.NotificationPage;

public class NotificationTest extends Base {

    @Test
    public void testClickButtonInFirstFrame() {
        home.clickNotification();
        NotificationPage page=new NotificationPage(driver);
        page.clickSucessMessageButton();
        Assert.assertTrue(page.isSuccessfulMesaageDisplayed());
        page.clickCloseNotifiction();
    }
}
