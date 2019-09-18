package automation.configuration;


import automation.commons.BaseTest;
import bean.enums.Web;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BaseTest {

    @Before(value = "@web")
    public void berforeWeb(){
        inicialiarWeb(Web.CHROME);
    }


    @After(value = "@web")
    public void afterWeb(){
        closeWeb();
    }

}
