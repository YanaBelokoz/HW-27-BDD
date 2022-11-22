package PO;

import Drivers.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.awt.*;
import java.sql.DriverManager;

public class Item extends AbstractPO{
    @FindBy(xpath = "//ul[@class = 'product-buttons']//span[@class = 'buy-button_label ng-star-inserted']")
    public Button buyBtn;
    public WebElement itemBO;

    public CartPopup clickBuyBtn(){
        System.out.println("Click add to cart on item page.");
        new WebDriver(DriverManager.getDriver(),5).until(ExpectedConditions.visibilityOf(buyBtn));
        buyBtn.click();
        return PageObject.getInstance().getCartPopup();
    }
}
