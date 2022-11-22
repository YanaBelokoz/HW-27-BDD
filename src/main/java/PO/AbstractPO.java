package PO;

import org.openqa.selenium.support.PageFactory;

import java.sql.DriverManager;

public class AbstractPO {

    public AbstractPO(){
        PageFactory.initElements(new ElementsDecorator(new DefaultElementLocatorFctory(DriverManager.getDriver())), this);
    }

    public Object clickBuyBtnPopup() {
        return null;
    }
}
