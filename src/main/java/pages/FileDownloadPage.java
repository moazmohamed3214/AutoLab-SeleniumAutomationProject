package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileDownloadPage {

    private WebDriver driver;
    private By textAreaLocator=By.id("textInput");
    private By generateFileLoctor=By.xpath("//button[text()='Generate File']");
    private By downloadfileLoctor=By.id("downloadLink");

    public FileDownloadPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void enterText(String text)
    {
        driver.findElement(textAreaLocator).sendKeys(text);
    }
    public void clickGenerateFile()
    {
        driver.findElement(generateFileLoctor).click();
    }
    public void clickDownloadFile()
    {
        driver.findElement(downloadfileLoctor).click();
    }
}
