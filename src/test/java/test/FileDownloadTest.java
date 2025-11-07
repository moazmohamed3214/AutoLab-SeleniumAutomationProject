package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileDownloadPage;
import pages.FileUpladPage;
import pages.Home;

import java.io.File;

public class FileDownloadTest extends Base {

    @Test
    public void testUploadfile() throws InterruptedException{

        home.clickFileDownload();
        FileDownloadPage page=new FileDownloadPage(driver);
        page.enterText("moaz");
        page.clickGenerateFile();
        page.clickDownloadFile();
        String expectedFileName = "myfile.txt";

        File downloadedFile = new File(downloadPath + File.separator + expectedFileName);

        int timeout = 0;
        while (!downloadedFile.exists() && timeout < 10) {
            Thread.sleep(1000);
            timeout++;
        }

        // Assertions
        Assert.assertTrue(downloadedFile.exists(), " File was not downloaded!");
        Assert.assertTrue(downloadedFile.length() > 0, " Downloaded file is empty!");
        System.out.println(" File downloaded successfully at: " + downloadedFile.getAbsolutePath());


    }
}
