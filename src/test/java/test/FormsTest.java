package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FormsPage;
import pages.Home;

public class FormsTest extends Base {



    @Test
    public void testFormSubmissionWithValidData() {
        home.clickFormPage();
        FormsPage page = new FormsPage(driver);

        page.enterFirstName("Moaz");
        page.enterMiddleName("Mohamed");
        page.enterLastName("Abdel Fattah");
        page.enterEmail("moaz1@gmail.com");
        page.enterPassword("moaz_123");
        page.enterAddress("5 Amin Anes St");
        page.enterCity("Cairo");
        page.enterState("Egypt");
        page.enterPinCode("12345");

        page.clickSubmit();

        Assert.assertTrue(page.isFormSubmittedSuccessfully(),
                "The success message was not displayed as expected.");
    }
}
