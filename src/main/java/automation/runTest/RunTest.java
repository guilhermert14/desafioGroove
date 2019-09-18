package automation.runTest;

import automation.commons.BaseTest;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
//                "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html",
                "pretty", "json:target/cucumber.json",
        },
        features = {
                ".//src//test//resources"
        },
        glue = {
                "automation", "practice",
        },
        tags = {
                "@web"
        }
)
public class RunTest extends BaseTest {

}
