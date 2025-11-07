package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShadowDomPage {
    private WebDriver driver;
    private By outsideShadowDomText = By.xpath("//h3[text()='This is outside Shadow DOM']");
    private By shadowHost = By.id("shadow-host");

    public ShadowDomPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isOutsideShadowDomMessageDisplayed() {
        return driver.findElement(outsideShadowDomText).getText()
                .equals("This is outside Shadow DOM");
    }

    public boolean isHelloShadowDomMessageDisplayed() {
        return driver.findElement(shadowHost).getText()
                .equals("Hello from Shadow DOM!");
    }
}
