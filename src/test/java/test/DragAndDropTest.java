package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DragAndDropPage;
import pages.DropDownPage;
import pages.Home;

public class DragAndDropTest extends Base {

    @Test
    public void testDragAndDrop() {
        home.clickDropDownPage();
        DragAndDropPage page = new DragAndDropPage(driver);
        page.performDragAndDrop();
    }
}
