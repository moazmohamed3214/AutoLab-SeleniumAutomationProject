package pages;

import org.openqa.selenium.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static utils.Waits.waitElementToBeVisible;

public class FileUpladPage {
    private WebDriver driver;
    private final By fileInputLocator = By.cssSelector("input[type='file']");
    private final By browseButtonLocator = By.className("file-label");
    private final By outputLocator = By.id("fileInfo");
    private final By dropAreaLocator = By.id("drop-area");

    public FileUpladPage(WebDriver driver) {
        this.driver = driver;
    }


     // Clicks on the "Browse File" button.
     // Note: This opens the system file picker, which Selenium cannot handle directly.

    public void clickBrowseButton() {
        waitElementToBeVisible(driver, browseButtonLocator).click();
    }


     // Uploads a file directly by sending its absolute path to the hidden input field.
     // This method bypasses the OS file picker dialog.

    public void uploadFile(String filePath) {
        WebElement fileInput = driver.findElement(fileInputLocator);
        makeInputVisible(fileInput);
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].style.display='block';", fileInput);
        String validPath = validateFilePath(filePath);
        fileInput.sendKeys(validPath);
    }

    /**
     * Simulates a drag-and-drop upload by sending the file path to the hidden input element
     * and visually highlighting the drop area. Real drag events are restricted by browsers.
     */
    public void uploadFileByDragAndDrop(String filePath) {
        WebElement dropArea = driver.findElement(dropAreaLocator);
        WebElement fileInput = driver.findElement(fileInputLocator);

        makeInputVisible(fileInput);

        String validPath = validateFilePath(filePath);
        fileInput.sendKeys(validPath);

        // Optional: visually highlight drop zone
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].style.border='3px solid green';", dropArea);
    }


    public String getOutputInfo() {
        return driver.findElement(outputLocator).getText().trim();
    }


     //Validates that the provided file path exists and returns its absolute path.
     //Throws IllegalArgumentException if not found.

    private String validateFilePath(String filePath) {
        Path path = Paths.get(filePath).toAbsolutePath();
        if (!Files.exists(path)) {
            throw new IllegalArgumentException(" File not found at path: " + path);
        }
        return path.toString();
    }


     // Makes a hidden <input type="file"> element visible using JavaScript.
    private void makeInputVisible(WebElement fileInput) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].style.display='block';", fileInput);
    }
}
