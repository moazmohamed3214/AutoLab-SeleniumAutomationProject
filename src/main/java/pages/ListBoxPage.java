package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class ListBoxPage {
    private WebDriver driver;
    private By firstListLocator=By.id("list1");
    private By addButtonLocator=By.id("add");
    private By secondListLocator=By.id("list2");
    private By addAllButtonLocator=By.id("addAll");
    private By removeButtonLocator=By.id("remove");
    private By removeAllButtonLocator=By.id("removeAll");


    public ListBoxPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void selectFromFirstList(String name) {
        new Select(driver.findElement(firstListLocator)).selectByVisibleText(name);
    }

    public void selectFromSecondList(String name) {
        new Select(driver.findElement(secondListLocator)).selectByVisibleText(name);
    }
    public void clickAddButton()
    {
        driver.findElement(addButtonLocator).click();
    }
    public void clickAddAllButton()
    {
        driver.findElement(addAllButtonLocator).click();
    }
    public void clickRemoveButton()
    {
        driver.findElement(removeButtonLocator).click();
    }
    public void clickRemoveAllButton()
    {
        driver.findElement(removeAllButtonLocator).click();
    }
    public boolean isInFirstList(String name)
    {

        Select select=new Select(driver.findElement(firstListLocator));
        List<WebElement> list=select.getOptions();
        return list.stream().anyMatch(o->o.getText().equals(name));


    }
    public boolean isInSecondList(String name)
    {

        Select select=new Select(driver.findElement(secondListLocator));
        List<WebElement> list=select.getOptions();
        return list.stream().anyMatch(o->o.getText().equals(name));


    }




}
