package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

import static utils.Waits.waitElementToBeVisible;

public class WebTablePage {
    private WebDriver driver;
    private By columnsLocator = By.xpath("//table[@id='dataTable']//thead//th");
    private By rowsLocator = By.xpath("//table[@id='dataTable']//tbody//tr");
    private By searchLocator = By.id("searchInput");

    public WebTablePage(WebDriver driver) {
        this.driver = driver;
    }

    public int getRowCount() {
        List<WebElement> rows = driver.findElements(rowsLocator);
        return rows.size();
    }

    public int getColumnCount() {
        List<WebElement> columns = driver.findElements(columnsLocator);
        return columns.size();
    }

    public void printAllTableData() {
        List<WebElement> columns = driver.findElements(columnsLocator);
        List<WebElement> rows = driver.findElements(rowsLocator);

        for (int i = 1; i <= rows.size(); i++) {
            for (int j = 1; j <= columns.size(); j++) {
                WebElement element = driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr[" + i + "]//td[" + j + "]"));
                System.out.print(element.getText() + "  | ");
            }
            System.out.println();
        }
    }

    public boolean isRecordPresent(String name) {
        driver.findElement(searchLocator).sendKeys(name);
        List<WebElement> columns = driver.findElements(columnsLocator);
        List<WebElement> rows = driver.findElements(rowsLocator);
        boolean found = false;

        for (int i = 1; i <= rows.size(); i++) {
            for (int j = 1; j <= columns.size(); j++) {
                WebElement element = driver.findElement(By.xpath("//table[@id='dataTable']//tbody//tr[" + i + "]//td[" + j + "]"));
                if (element.getText().equals(name)) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }
}
