package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static utils.Waits.waitElementToBeVisible;

public class FormsPage {

    // 🔹 Attributes
    private WebDriver driver;

    // 🔹 Locators
    private By firstNameLocator = By.id("firstname");
    private By middleNameLocator = By.id("middlename");
    private By lastNameLocator = By.id("lastname");
    private By emailLocator = By.id("email");
    private By passwordLocator = By.id("password");
    private By addressLocator = By.id("address");
    private By cityLocator = By.id("city");
    private By stateLocator = By.id("states");
    private By pinCodeLocator = By.id("pincode");
    private By submitButtonLocator = By.xpath("//button[text()='Submit']");
    private By successMessageLocator = By.id("message");

    // 🔹 Constructor
    public FormsPage(WebDriver driver) {
        this.driver = driver;
    }

    // 🔹 Actions
    public void enterFirstName(String firstName) {
        waitElementToBeVisible(driver, firstNameLocator).sendKeys(firstName);
    }

    public void enterMiddleName(String middleName) {
        driver.findElement(middleNameLocator).sendKeys(middleName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameLocator).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailLocator).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
    }

    public void enterAddress(String address) {
        driver.findElement(addressLocator).sendKeys(address);
    }

    public void enterCity(String city) {
        driver.findElement(cityLocator).sendKeys(city);
    }

    public void enterState(String state) {
        driver.findElement(stateLocator).sendKeys(state);
    }

    public void enterPinCode(String pinCode) {
        driver.findElement(pinCodeLocator).sendKeys(pinCode);
    }

    public void clickSubmit() {
        driver.findElement(submitButtonLocator).click();
    }

    // 🔹 Verification
    public boolean isFormSubmittedSuccessfully() {
        String message = waitElementToBeVisible(driver, successMessageLocator).getText();
        return message.equalsIgnoreCase("Form submitted successfully");
    }
}
