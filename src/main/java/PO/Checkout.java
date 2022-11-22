package PO;

import Elements.TextLables;
import org.openqa.selenium.support.FindBy;

public class Checkout extends AbstractPO{
    @FindBy(xpath = "//dl[contains(@class, 'js-total')]//dd")
    public TextLables totalAmountText;
}
