package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDropPage {
    private WebDriver driver;
    private By inboxElementLoctor= By.xpath("//strong[text()='Item 1:-']");
    private By personalElementLoctor= By.xpath("//strong[text()='Item 2:-']");

    public DragAndDropPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void performDragAndDrop()
    {
        WebElement source=driver.findElement(inboxElementLoctor);
        WebElement target=driver.findElement(personalElementLoctor);
        Actions action=new Actions(driver);
        action.dragAndDrop(source,target)
                .perform();



    }

}
