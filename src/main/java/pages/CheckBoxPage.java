package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static utils.Waits.waitElementToBeVisible;

public class CheckBoxPage {

    // 🔹 Attributes
    private WebDriver driver;

    // 🔹 Locators
    private By singleCheckboxLocator = By.id("myCheckbox");
    private By checkedMessageLocator = By.id("message");
    private By firstEnabledCheckboxLocator = By.id("chk1");
    private By secondEnabledCheckboxLocator = By.id("chk2");
    private By firstDisabledCheckboxLocator = By.id("chk3");
    private By secondDisabledCheckboxLocator = By.id("chk4");
    private By toggleAllButtonLocator = By.id("toggleBtn");

    // 🔹 Constructor
    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    // 🔹 Actions

    public void clickSingleCheckbox() {
        waitElementToBeVisible(driver, singleCheckboxLocator).click();
    }

    public void clickEnabledCheckboxes() {
        waitElementToBeVisible(driver, firstEnabledCheckboxLocator).click();
        waitElementToBeVisible(driver, secondEnabledCheckboxLocator).click();
    }

    public void clickDisabledCheckboxes() {
        waitElementToBeVisible(driver, firstDisabledCheckboxLocator).click();
        waitElementToBeVisible(driver, secondDisabledCheckboxLocator).click();
    }

    public void clickToggleAllButton() {
        driver.findElement(toggleAllButtonLocator).click();
    }

    // 🔹 Assertions / Verifications

    public boolean isCheckedMessageDisplayed() {
        String message = driver.findElement(checkedMessageLocator).getText();
        return message.equalsIgnoreCase("checked");
    }

    public boolean areEnabledCheckboxesActive() {
        return driver.findElement(firstEnabledCheckboxLocator).isEnabled() &&
                driver.findElement(secondEnabledCheckboxLocator).isEnabled();
    }

    public boolean areDisabledCheckboxesInactive() {
        return !driver.findElement(firstDisabledCheckboxLocator).isEnabled() &&
                !driver.findElement(secondDisabledCheckboxLocator).isEnabled();
    }

    public boolean isToggleButtonConvertedToUncheckAll() {
        String buttonText = driver.findElement(toggleAllButtonLocator).getText();
        return buttonText.equalsIgnoreCase("Uncheck All");
    }
}
