package UI;

import Drivers.PageObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestRozetka extends BaseTest {
    private static final Logger LOGGER = LogManager.getLogger(TestRozetka.class);

    @Test
    public void Test(){
        businessManager.getMainBO()
                .enterQueryAndSearch("laptop");

        businessManager.getCatalogBO()
                .setMaximumPriceInFilter(200000);

        businessManager.getCatalogBO()
                .selectItemFromCatalogByIndex(1);

        businessManager.getItemBO()
                .addItemToCartAndProceedToChtckout();

        Assert.assertTrue(PageObject.getInstance().getCheckoutPage().totalAmountText.getIntValueFromLable() < 200000);
    }
}