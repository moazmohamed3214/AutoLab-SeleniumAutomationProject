package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.WindowPopupPage;

public class WindowPopupTest extends Base {

    @Test
    public void verifySuccessModal() {

        home.clickModalPopUp();

        WindowPopupPage popup = new WindowPopupPage(driver);
        popup.clickSuccessModal();

        String title = popup.getText();
        System.out.println("Success Modal Title: " + title);
        Assert.assertEquals(title, "Success Modal", "Success Modal title mismatch");

        popup.clickClosePopup();
    }

    @Test
    public void verifyInfoModal() {

        home.clickModalPopUp();

        WindowPopupPage popup = new WindowPopupPage(driver);
        popup.clickInfoModal();

        String title = popup.getText();
        System.out.println("Info Modal Title: " + title);
        Assert.assertEquals(title, "Information Modal", "Info Modal title mismatch");

        popup.clickClosePopup();
    }

    @Test
    public void verifyPrimaryModal() {

        home.clickModalPopUp();

        WindowPopupPage popup = new WindowPopupPage(driver);
        popup.clickPrimaryModal();

        String title = popup.getText();
        System.out.println("Primary Modal Title: " + title);
        Assert.assertEquals(title, "Primary Modal", "Primary Modal title mismatch");

        popup.clickClosePopup();
    }

    @Test
    public void verifyErrorModal() {

        home.clickModalPopUp();

        WindowPopupPage popup = new WindowPopupPage(driver);
        popup.clickErrorModal();

        String title = popup.getText();;
        System.out.println("Error Modal Title: " + title);
        Assert.assertEquals(title, "Danger Modal", "Error Modal title mismatch");

        popup.clickClosePopup();
    }
}

