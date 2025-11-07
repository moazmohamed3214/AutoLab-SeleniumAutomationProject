package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static utils.Waits.waitElementToBeVisible;

public class DropDownPage {

    private WebDriver driver;
    public String selectedFruit;

    // 🔹 Locators
    private By fruitDropdownLocator = By.id("fruitDropdown");
    private By fruitResultMessageLocator = By.id("result");
    private By countryDropdownLocator = By.id("countryDropdown");
    private By firstSelectedButtonLocator = By.xpath("//button[text()='First Selected']");
    private By lastSelectedButtonLocator = By.xpath("//button[text()='Last Selected']");
    private By firstCountryOutputLocator = By.id("outputFirst");
    private By lastCountryOutputLocator = By.id("outputLast");

    // 🔹 Constructor
    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    // 🔹 Actions
    public void selectFruitFromDropdown() {
        WebElement dropdown = driver.findElement(fruitDropdownLocator);
        Select select = new Select(dropdown);
        select.selectByValue(selectedFruit);
    }

    public void selectTwoCountries() {
        WebElement dropdown = driver.findElement(countryDropdownLocator);
        Select select = new Select(dropdown);
        select.selectByVisibleText("India");
        driver.findElement(firstSelectedButtonLocator).click();
        select.deselectByVisibleText("India");
        select.selectByVisibleText("UK");
        driver.findElement(lastSelectedButtonLocator).click();
    }

    // 🔹 Verifications
    public boolean isFruitSelectionMessageDisplayed() {
        return driver.findElement(fruitResultMessageLocator)
                .getText()
                .equals("You selected: " + selectedFruit);
    }

    public boolean areFirstAndLastCountryMessagesDisplayed() {
        return driver.findElement(firstCountryOutputLocator).getText().equals("First selected value: India") &&
                driver.findElement(lastCountryOutputLocator).getText().equals("Last selected value: UK");
    }
}
