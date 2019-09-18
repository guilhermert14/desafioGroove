package automation.commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import bean.interfaces.WebApplication;

public class BaseTest {

    protected static WebDriver driver;
    protected static WebDriverWait wait;


    protected void inicialiarWeb(WebApplication webApplication) {
        driver = webApplication.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 15);
    }

    protected static void closeWeb() {
        driver.quit();
    }
}
