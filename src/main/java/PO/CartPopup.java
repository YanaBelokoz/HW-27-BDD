package PO;

import Drivers.PageObject;
import Elements.TextLables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.sql.DriverManager;

public class CartPopup extends AbstractPO{
    @FindBy(xpath = "//div[contains(@class, 'cart-receipt')]//a")
    public Button buyBtn;

    @FindBy(xpath = "//div[contains(@class, 'cart-receipt')]//a")
    public TextLables sunText;

    public Object clickBuyBtnPopup(){
        System.out.println("Click proceed to checkout on cart popup. ");
        new WebDriver(DriverManager.getDriver(),5).until(ExpectedConditions.elementToBeClickable((WebElement) buyBtn));
        ((WebElement) buyBtn).click();
        return PageObject.getInstance().getCheckoutPage();
    }
}
