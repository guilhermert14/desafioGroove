package automation.commons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SeleniumRobot extends BaseTest{

    private static Random rnd = new Random();

    public static void clicaElemento(String element){
        String xpath = "//*[contains(text(),'"+element+"')]";
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        driver.findElement(By.xpath(xpath)).click();
    }

    public static void selecionarRadioButtonRandomico(String xpath){
        List<WebElement> radios = driver.findElements(By.xpath(xpath));
        radios.get(rnd.nextInt(radios.size())).click();
    }

    public static void selecionarOpcaoDropDownRandomico(WebElement elemento){
        Select comboBox = new Select(elemento);
        int opcao = new Random().nextInt(comboBox.getOptions().size());
        comboBox.selectByIndex(opcao);
    }

    public static void selecionaTextoDropDown(WebElement elememto, String valor) {

        Select nameItem = new Select(elememto);
        nameItem.selectByVisibleText(valor);

    }

    public static void selecionaValueDropDown(WebElement elememto, String valor) {

        Select nameItem = new Select(elememto);
        nameItem.selectByValue(valor);

    }


}
