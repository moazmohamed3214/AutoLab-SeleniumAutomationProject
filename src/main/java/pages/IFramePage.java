package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IFramePage {

    private WebDriver driver;

    //  Locators
    private By firstFrameLocator = By.xpath("//iframe[@name='iframe1']");
    private By secondFrameLocator = By.xpath("//iframe[@name='iframe2']");
    private By firstFrameButtonLocator = By.tagName("button");
    private By secondFrameButtonLocator = By.tagName("button");
    private By successMessageLocator = By.id("message");

    //  Constructor
    public IFramePage(WebDriver driver) {
        this.driver = driver;
    }

    //  Actions
    public void clickButtonInFirstFrame() {
        WebElement frame = driver.findElement(firstFrameLocator);
        driver.switchTo().frame(frame);
        driver.findElement(firstFrameButtonLocator).click();
        driver.switchTo().defaultContent();
    }

    public void clickButtonInSecondFrame() {
        WebElement frame = driver.findElement(secondFrameLocator);
        driver.switchTo().frame(frame);
        driver.findElement(secondFrameButtonLocator).click();
        driver.switchTo().defaultContent();
    }

    //  Verification
    public boolean isSuccessMessageDisplayedIFrame1() {
        return driver.findElement(successMessageLocator).getText().contains("You have clicked on iframe 1 button");
    }
    public boolean isSuccessMessageDisplayedIFrame2() {
        return driver.findElement(successMessageLocator).getText().contains("You have clicked on iframe 2 button");
    }
}
