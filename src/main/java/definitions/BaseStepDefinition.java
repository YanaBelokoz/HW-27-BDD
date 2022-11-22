package definitions;

import Drivers.BusinessManager;
import Drivers.PageObject;
import io.cucumber.java.After;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import sun.jvm.hotspot.debugger.Address;

import java.util.Map;

public class BaseStepDefinition {
    private BusinessManager businessManager;
    private PageObject pageObject;

    @Given("Initialize - I am on main page Rozetka")
    public void Init_I_am_on_main_page_rozetka() {
        businessManager = BusinessManager.getInstance();
        pageObject = PageObject.getInstance();
        DriverManager.createDriver();
        DriverManager.getDriver().get("url");
    }

    @Then("I enter {words} search string in header searchbar")
    public void Enter_search_string_in_header(String words){
        businessManager
                .getMainBO()
                .enterQueryAndSearch(words);
    }

    @And("I select {int} item on catalog")
    public void I_select_item(int index){
        businessManager
                .getCatalogBO()
                .selectItemFromCatalogByIndex(--index);
    }

    @Then("Verify on product page")
    public void Verify_on_product_page(){
        new WebDriver(DriverManager.getDriver(),10.until(ExpectedConditions.visibilityOf(pageObject.getItem().itemBO));
        Assert.assertTrue(pageObject.getItem().itemBO.isDisplayed());
    }

    @Then("Verify that locating on catalog page with laptops")
    public void Verify_on_catalog_with_laptops(){
        new WebDriver(DriverManager.getDriver()10).until(ExpectedConditions.visibilityOf(pageObject.getCatalog().titlePage));
        Assert.assertTrue(pageObject.getCatalog().titlePage.getText().equals("Ноутбуки"));
    }

}

