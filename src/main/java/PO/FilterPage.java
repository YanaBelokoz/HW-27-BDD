package PO;

import Drivers.PageObject;
import definitions.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;

public class FilterPage extends AbstractPO {

    @FindBy(xpath = "//div[@data-filter-name = 'price']//input[@formcontrolname = 'max']")
    public WebElement maxPriceInput;

    @FindBy(xpath = "//div[@data-filter-name = 'price']//button[@type = 'submit']")
    public Button applyFilterBtn;

    public FilterPage setMaxPrice(String text){
        System.out.println("Input price in filter: " + text);
        new DriverManager(DriverManager.getDriver(),5).until(ExpectedConditions.elementToBeClickable((WebElement) applyFilterBtn));
        ((WebElement) applyFilterBtn).click();
        return PageObject.getInstance().getFilterPage();
    }

    public void applyMaxPriceFilter() {
    }

    public void setMaximumPrice(String valueOf) {
    }
}
