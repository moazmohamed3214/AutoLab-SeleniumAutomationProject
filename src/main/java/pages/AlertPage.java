package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static utils.Waits.waitElementToBeVisible;

public class AlertPage {
    private WebDriver driver;

    // Locators
    private By showAlertButton = By.xpath("//button[text()='Show Alert']");
    private By showConfirmButton = By.xpath("//button[text()='Show Confirm']");
    private By showPromptButton = By.xpath("//button[text()='Show Prompt']");
    private By outputMessage = By.id("output");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public void clickShowAlertButton() {
        waitElementToBeVisible(driver, showAlertButton).click();
    }

    public void clickShowConfirmButton() {
        waitElementToBeVisible(driver, showConfirmButton).click();
    }

    public void clickShowPromptButton() {
        waitElementToBeVisible(driver, showPromptButton).click();
    }

    public boolean handleAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return driver.findElement(outputMessage).getText().contains("Alert shown.");
    }

    public boolean handleConfirmAlert() {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return driver.findElement(outputMessage).getText().contains("You clicked OK on confirm button.");
    }

    public boolean handlePromptAlert(String name) {
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();
        return driver.findElement(outputMessage).getText().contains("You entered: " + name);
    }
}
