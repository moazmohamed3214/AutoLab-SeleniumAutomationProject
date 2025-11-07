package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Waits.waitElementToBeVisible;

public class RadioButtonPage {

    private WebDriver driver;

    // 🔹 Locators
    private By maleRadioButton = By.xpath("//input[@value='Male']");
    private By selectedMessage = By.id("result");
    private By showSelectedGenderButton = By.xpath("//button[text()='Show Selected Gender']");
    private By enabledRadioButton1 = By.xpath("//input[@value='Radio Button 1']");
    private By disabledRadioButton = By.xpath("//input[@value='Disabled Radio Button']");
    private By genderMaleOption = By.xpath("//p[text()='Select Gender:']/following::input[@value='Male']");
    private By ageUnder18Option = By.xpath("//label[text()=' Under 18']");
    private By showSelectedValuesButton = By.xpath("//button[text()='Show Selected Values']");
    private By selectedValuesMessage = By.id("result3");

    // 🔹 Constructor
    public RadioButtonPage(WebDriver driver) {
        this.driver = driver;
    }

    // 🔹 Actions
    public void selectMaleRadioButton() {
        waitElementToBeVisible(driver, maleRadioButton).click();
    }

    public void clickShowSelectedGenderButton() {
        waitElementToBeVisible(driver, showSelectedGenderButton).click();
    }

    public void selectEnabledRadioButton1() {
        waitElementToBeVisible(driver, enabledRadioButton1).click();
    }

    public void attemptClickDisabledRadioButton() {
        waitElementToBeVisible(driver, disabledRadioButton).click();
    }

    public void selectMaleInGenderGroup() {
        waitElementToBeVisible(driver, genderMaleOption).click();
    }

    public void selectUnder18AgeGroup() {
        waitElementToBeVisible(driver, ageUnder18Option).click();
    }

    public void clickShowSelectedValuesButton() {
        waitElementToBeVisible(driver, showSelectedValuesButton).click();
    }

    // 🔹 Verifications
    public boolean isMaleSelectionMessageDisplayed() {
        String message = waitElementToBeVisible(driver, selectedMessage).getText();
        return message.equalsIgnoreCase("You selected: Male");
    }

    public boolean isRadioButton1Enabled() {
        return driver.findElement(enabledRadioButton1).isEnabled();
    }

    public boolean isDisabledRadioButtonInactive() {
        return !driver.findElement(disabledRadioButton).isEnabled();
    }

    public boolean isSelectedValuesMessageCorrect() {
        String message = waitElementToBeVisible(driver, selectedValuesMessage).getText();
        return message.equals("You selected: Gender = Radio Button 1, Age Group = Under 18");
    }
}
