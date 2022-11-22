package definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.time.Duration;


public class DriverManager {
    private static WebDriver driver;

    public static void createDriver () {
        System.setProperty(PropertyReader.getValue("name"), PropertyReader.getValue("driverPath"));
        driver = new ChromeDriver();
        System.setProperty("driver.chrome.driver", System.getProperty("user.dir") + "/scr/drivers/chromedriver");
        ChromeOptions params = new ChromeOptions();
        params.addArguments("window-size=1036,816");
        params.addArguments("--start-fullscreen");
        params.addArguments("enable-automation");
        params.addArguments("--disable-extensions");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(Long.parseLong(PropertyReader.getValue("timeout"))));
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {

        return driver;
    }
}

