package test;

import base.Base;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Home;
import pages.SliderPage;

public class SliderTest extends Base {
    @Test
    public void testSlider()
    {

        home.clickSlider();
        SliderPage page=new SliderPage(driver);
        page.moveSliderToValueJS(50);
        Assert.assertEquals(page.getSliderValue(),50);


    }

}
