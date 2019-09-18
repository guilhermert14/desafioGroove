package practice.funcionalidades;


import automation.commons.BaseTest;
import automation.commons.SeleniumRobot;
import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.ExpectedConditions;
import practice.pages.CadastroPage;

import java.util.Locale;

public class CadastroFuncionalidade extends BaseTest {

    private CadastroPage cadastroPage;
    Faker faker = new Faker(new Locale("pt-BR"));
    int random = 1 + (int) (Math.random() * 10000);
    String email = faker.name().firstName().replace(" ", "_");
    String nome = faker.name().firstName();
    String sobrenome = faker.name().lastName();
    String endereco = faker.address().streetName();
    String cidade = faker.address().city();
    String telefone = faker.phoneNumber().phoneNumber();
    String celular = faker.phoneNumber().cellPhone();


    public CadastroFuncionalidade() {
        this.cadastroPage = new CadastroPage(driver);
    }

    public void inicializarWeb(String url) {
        driver.get(url);
    }


    public void preencherCadastro() {
        wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoEmail()));
        cadastroPage.getCampoEmail().sendKeys(email + random + "@com.br");
        cadastroPage.getBotaoCriarConta().click();

        wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getCampoNome()));
        SeleniumRobot.selecionarRadioButtonRandomico(cadastroPage.getXpathRadiosMrMrs());

        cadastroPage.getCampoNome().sendKeys(nome);
        cadastroPage.getCampoSobrenome().sendKeys(sobrenome);
        cadastroPage.getCampoSenha().sendKeys("desafioGroove");
        SeleniumRobot.selecionarOpcaoDropDownRandomico(cadastroPage.getSelectDia());
        SeleniumRobot.selecionarOpcaoDropDownRandomico(cadastroPage.getSelectMes());
        SeleniumRobot.selecionaValueDropDown(cadastroPage.getSelectAno(), "2000");
        cadastroPage.getCheckBoxSignUp().click();
        cadastroPage.getCampoNomeOutroEndereco().clear();
        cadastroPage.getCampoNomeOutroEndereco().sendKeys(faker.name().firstName());
        cadastroPage.getCampoSobrenomeOutroEndereco().clear();
        cadastroPage.getCampoSobrenomeOutroEndereco().sendKeys(faker.name().lastName());
        cadastroPage.getCampoCompania().sendKeys("Groove Tech");
        cadastroPage.getCampoEndereco().sendKeys(endereco);
        cadastroPage.getCampoCidade().sendKeys(cidade);
        SeleniumRobot.selecionarOpcaoDropDownRandomico(cadastroPage.getSelectEstado());
        cadastroPage.getCampoCep().sendKeys("11361");
        SeleniumRobot.selecionaTextoDropDown(cadastroPage.getSelectPais(), "United States");
        cadastroPage.getCampoInformacao().sendKeys("desafio Groove");
        cadastroPage.getCampoTelefone().sendKeys(telefone);
        cadastroPage.getCampoCelular().sendKeys(celular);
        cadastroPage.getCampoReferencia().clear();
        cadastroPage.getCampoReferencia().sendKeys("Teste Automacao");
        cadastroPage.getBotaoRegistrar().click();
    }

    public String validaLoginEfetuadoComSucesso(){
        wait.until(ExpectedConditions.elementToBeClickable(cadastroPage.getBotaoMeuEndereco()));
        return cadastroPage.getBotaoMeuEndereco().getText();
    }

}
