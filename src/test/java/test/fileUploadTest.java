package test;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUpladPage;
import pages.FormsPage;
import pages.Home;

public class fileUploadTest extends Base {


    @Test
    public void testUploadfile(){

        home.clickFileUpload();
        FileUpladPage page=new FileUpladPage(driver);
        //page.clickBrowseButton();
        page.uploadFile("D:\\Testing\\Tasks\\Electro Pi Task\\TestCases &Bug Report\\Test data\\عقد عمل.pdf");
        Assert.assertTrue(page.getOutputInfo().contains("عقد عمل.pdf"));

    }
    @Test
    public void testFileUploadByDragAndDrop() {

        home.clickFileUpload();

        FileUpladPage uploadPage = new FileUpladPage(driver);
        String filePath = "D:\\Testing\\Tasks\\Electro Pi Task\\TestCases &Bug Report\\Test data\\عقد عمل.pdf";

        uploadPage.uploadFileByDragAndDrop(filePath);

        String uploadedFile = uploadPage.getOutputInfo();
        Assert.assertTrue(uploadedFile.contains("عقد عمل.pdf"));
    }
}
