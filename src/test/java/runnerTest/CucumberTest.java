package runnerTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = {"src/test/resources/features"}, glue = {"com.main.definitions"},
        plugin = {"json:target/cucumber.json", "pretty", "html:target/cucumber-reports.html"})
public class CucumberTest extends AbstractTestNGCucumberTests{
}