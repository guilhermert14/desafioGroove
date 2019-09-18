package practice.steps;

import automation.commons.SeleniumRobot;
import cucumber.api.java.pt.E;

public class HomeStep {

    private SeleniumRobot seleniumRobot = new SeleniumRobot();

    @E("clico no link {string}")
    public void clicoNoLink(String link) {
        seleniumRobot.clicaElemento("Sign in");
    }
}
