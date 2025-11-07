package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.WebTablePage;

public class WebTableTest extends Base {


    @Test
    public void displayAllInfoWebTable() {
        home.clickWebTablePage();
        WebTablePage page = new WebTablePage(driver);
        System.out.println("The Number Of Columns : " + page.getColumnCount());
        System.out.println("The Number Of Rows : " + page.getRowCount());
        page.printAllTableData();
    }

    @Test
    public void searchElement() {
        home.clickWebTablePage();
        WebTablePage page = new WebTablePage(driver);
        Assert.assertTrue(page.isRecordPresent("John Doe"));
    }
}
