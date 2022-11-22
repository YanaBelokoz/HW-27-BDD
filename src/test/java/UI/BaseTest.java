package UI;

import Drivers.BusinessManager;
import definitions.DriverManager;
import org.asynchttpclient.Param;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.log4testng.Logger;

public abstract class BaseTest {
    protected String url;
    protected BusinessManager businessManager;
    public static Logger LOGGER = Logger.getLogger(BaseTest.class);

    @BeforeClass
    public void SetUp(){
        LOGGER.info("setup");

        businessManager = BusinessManager.getInstance();
        url = Param.URL;
        DriverManager.createDriver();
        get(url);
    }

    @AfterClass
    public void TearDown(){
        DriverManager.getDriver().close();
        DriverManager.getDriver().quit();
    }

    public void get(String url){
        LOGGER.info("Go to url: " + url);
        DriverManager.getDriver().get(url);
    }


}
