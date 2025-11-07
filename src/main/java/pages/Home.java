package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.Waits.waitElementToBeVisible;

public class Home {
    private WebDriver driver;
    private By checkBoxLoctor=By.xpath("//a[text()='CheckBox']");
    private By radioLoctor=By.xpath("//a[text()='Radio Button']");
    private By dropDownLoctor=By.xpath("//a[text()='Drop Down']");
    private By formsLoctor=By.xpath("//a[text()='Form']");
    private By webTableLoctor=By.xpath("//a[text()='Web Table']");
    private By iFrameLoctor=By.xpath("//a[text()='iFrame']");
    private By shadowDomLoctor=By.xpath("//a[text()='Shadow Dom']");
    private By dragAndDropLoctor=By.xpath("//a[text()='Drag & Drop']");
    private By NotificationLoctor=By.xpath("//a[text()='Notification ']");
    private By alertLoctor=By.xpath("//a[text()='Alerts']");
    private By fileUploadLoctor=By.xpath("//a[text()='File Upload']");
    private By fileDownloadLoctor=By.xpath("//a[text()='File Download']");
    private By modalPopupLoctor=By.xpath("//a[text()='Modal Popup']");
    private By listBoxLoctor=By.xpath("//a[text()='List Box']");
    private By sliderLoctor=By.xpath("//a[text()='Slider']");
    public Home(WebDriver driver)
    {
        this.driver=driver;
    }
    public void clickCheckBox()
    {
        waitElementToBeVisible(driver,checkBoxLoctor).click();
    }
    public void clickRadioButton()
    {
        waitElementToBeVisible(driver,radioLoctor).click();
    }
    public void clickDropDownPage()
    {
        waitElementToBeVisible(driver,dropDownLoctor).click();
    }
    public void clickFormPage()
    {
        waitElementToBeVisible(driver,formsLoctor).click();
    }
    public void clickWebTablePage()
    {
        waitElementToBeVisible(driver,webTableLoctor).click();
    }
    public void clickIFramePage()
    {
        waitElementToBeVisible(driver,iFrameLoctor).click();
    }
    public void clickShadowDomPage()
    {
        waitElementToBeVisible(driver,shadowDomLoctor).click();
    }
    public void clickDragAndDropPage()
    {
        waitElementToBeVisible(driver,dragAndDropLoctor).click();
    }
    public void clickNotification()
    {
        waitElementToBeVisible(driver,NotificationLoctor).click();
    }
    public void clickAlert()
    {
        waitElementToBeVisible(driver,alertLoctor).click();
    }
    public void clickFileUpload()
    {
        waitElementToBeVisible(driver,fileUploadLoctor).click();
    }
    public void clickFileDownload()
    {
        waitElementToBeVisible(driver,fileDownloadLoctor).click();
    }
    public void clickModalPopUp()
    {
        waitElementToBeVisible(driver,modalPopupLoctor).click();
    }
    public void clickListBox()
    {
        waitElementToBeVisible(driver,listBoxLoctor).click();
    }
    public void clickSlider()
    {
        waitElementToBeVisible(driver,sliderLoctor).click();
    }






}
