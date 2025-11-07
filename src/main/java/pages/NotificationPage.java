package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Waits.waitElementToBeVisible;

public class NotificationPage {
    private WebDriver driver;
    private By successMessageButton=By.className("btn btn-success toastsDefaultSuccess mr-5");
    private By infoMessageButton=By.cssSelector(".toast-body");
    private By closeButton=By.className("ml-2 mb-1 close");

    public NotificationPage(WebDriver driver)
    {
        this.driver=driver;
    }

    public void clickSucessMessageButton()
    {
        waitElementToBeVisible(driver,successMessageButton);
    }
    public void clickCloseNotifiction()
    {
        waitElementToBeVisible(driver,closeButton);
    }
    public boolean isSuccessfulMesaageDisplayed()
    {
        return waitElementToBeVisible(driver,infoMessageButton).getText().contains("Notification Body:- You Notification Body Goes Here.");
    }






}
