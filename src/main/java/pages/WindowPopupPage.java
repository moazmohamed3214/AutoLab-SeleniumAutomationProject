package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static utils.Waits.waitElementToBeVisible;

public class WindowPopupPage {
    private WebDriver driver;
    private By successModalLocator  = By.cssSelector(".btn.btn-success.mr-1");
    private By infoModalLocator     = By.cssSelector(".btn.btn-info.mr-1");
    private By primaryModalLocator  = By.cssSelector(".btn.btn-primary.mr-1");
    private By errorModalLocator    = By.cssSelector(".btn.btn-danger");
    private By closePopUpButtonLocator = By.cssSelector(".btn.btn-outline-light");
    private By titleMessagePopupLocator = By.cssSelector(".modal-title");


    public WindowPopupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSuccessModal() {
        driver.findElement(successModalLocator).click();
    }

    public void clickInfoModal() {
        driver.findElement(infoModalLocator).click();
    }

    public void clickPrimaryModal() {
        driver.findElement(primaryModalLocator).click();
    }

    public void clickErrorModal() {
        driver.findElement(errorModalLocator).click();
    }

    public void clickClosePopup() {
        driver.findElement(closePopUpButtonLocator).click();
    }

    public String getText() {
        return waitElementToBeVisible(driver, titleMessagePopupLocator).getText();
    }
}
