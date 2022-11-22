package PO;

import Drivers.PageObject;
import Drivers.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.DriverManager;
import java.util.List;

public class Catalog extends AbstractPO {
    @FindBy(xpath = "//a[contains(@class, 'good-tile__picture')]")
    public List<WebElement> catalog;

    public void chooseItem(int index){
        System.out.println("Item selected from catalog, item index: " + index);
        Util.scrollJsIntoView();
        new WebDriver(DriverManager.getDriver(),10).until(ExpectedConditions.elementToBeClickable(catalog.get(index)));
        Util.jsClickElement(catalog.get(index));
        PageObject.getInstance().getItem();
    }
}
