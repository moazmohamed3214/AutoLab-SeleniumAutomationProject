package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {
    private WebDriver driver;
    private By sliderLoctor=By.id("slider1");

    public SliderPage(WebDriver driver)
    {
        this.driver=driver;
    }
//    public void moveSliderTo(int val)
//    {
//        WebElement slider=driver.findElement(sliderLoctor);
//        int width = slider.getSize().width;
//        // Slider range (assume 0–100)
//        int min = Integer.parseInt(slider.getAttribute("min"));
//        int max = Integer.parseInt(slider.getAttribute("max"));
//        int current = Integer.parseInt(slider.getAttribute("value"));
//
//        // Calculate the xOffset (in pixels)
//        int xOffset = (int) ((double) (val - current) / (max - min) * width);
//        Actions action=new Actions(driver);
//        action.dragAndDropBy(slider,xOffset,0).perform();
//    }

    public void moveSliderToValueJS(int value) {
        WebElement slider = driver.findElement(sliderLoctor);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].value = arguments[1]; arguments[0].dispatchEvent(new Event('change'));",
                        slider, value);
    }

    public int getSliderValue()
    {
        WebElement slider=driver.findElement(sliderLoctor);
        return Integer.parseInt(slider.getAttribute("value"));

    }
}
