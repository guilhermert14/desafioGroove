package practice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CadastroPage {

    public CadastroPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email_create")
    private WebElement campoEmail;

    @FindBy(id = "SubmitCreate")
    private WebElement botaoCriarConta;

    @FindBy(id = "customer_firstname")
    private WebElement campoNome;

    @FindBy(id = "customer_lastname")
    private WebElement campoSobrenome;

    @FindBy(id = "passwd")
    private WebElement campoSenha;

    String xpathRadiosMrMrs = "//div[@class='radio-inline']";

    @FindBy(id = "days")
    private WebElement selectDia;

    @FindBy(id = "months")
    private WebElement selectMes;

    @FindBy(id = "years")
    private WebElement selectAno;

    @FindBy(id = "uniform-newsletter")
    private WebElement checkBoxSignUp;

    @FindBy(id = "uniform-optin")
    private WebElement checkBoxReceive;

    @FindBy(id = "firstname")
    private WebElement campoNomeOutroEndereco;

    @FindBy(id = "lastname")
    private WebElement campoSobrenomeOutroEndereco;

    @FindBy(id = "company")
    private WebElement campoCompania;

    @FindBy(id = "address1")
    private WebElement campoEndereco;

    @FindBy(id = "address2")
    private WebElement campoEndereco2;

    @FindBy(id = "city")
    private WebElement campoCidade;

    @FindBy(id = "id_state")
    private WebElement selectEstado;

    @FindBy(id = "postcode")
    private WebElement campoCep;

    @FindBy(id = "id_country")
    private WebElement selectPais;

    @FindBy(id = "other")
    private WebElement campoInformacao;

    @FindBy(id = "phone")
    private WebElement campoTelefone;

    @FindBy(id = "phone_mobile")
    private WebElement campoCelular;

    @FindBy(id = "alias")
    private WebElement campoReferencia;

    @FindBy(id = "submitAccount")
    private WebElement botaoRegistrar;

    @FindBy(xpath = "//a[@title='Addresses']")
    private WebElement botaoMeuEndereco;



    public WebElement getCampoEmail() {
        return campoEmail;
    }

    public WebElement getBotaoCriarConta() {
        return botaoCriarConta;
    }

    public WebElement getCampoNome() {
        return campoNome;
    }

    public WebElement getCampoSobrenome() {
        return campoSobrenome;
    }

    public WebElement getCampoSenha() {
        return campoSenha;
    }

    public String getXpathRadiosMrMrs() {
        return xpathRadiosMrMrs;
    }

    public WebElement getSelectDia() {
        return selectDia;
    }

    public WebElement getSelectMes() {
        return selectMes;
    }

    public WebElement getSelectAno() {
        return selectAno;
    }

    public WebElement getCheckBoxSignUp() {
        return checkBoxSignUp;
    }

    public WebElement getCheckBoxReceive() {
        return checkBoxReceive;
    }

    public WebElement getCampoNomeOutroEndereco() {
        return campoNomeOutroEndereco;
    }

    public WebElement getCampoSobrenomeOutroEndereco() {
        return campoSobrenomeOutroEndereco;
    }

    public WebElement getCampoCompania() {
        return campoCompania;
    }

    public WebElement getCampoEndereco() {
        return campoEndereco;
    }

    public WebElement getCampoEndereco2() {
        return campoEndereco2;
    }

    public WebElement getCampoCidade() {
        return campoCidade;
    }

    public WebElement getSelectEstado() {
        return selectEstado;
    }

    public WebElement getCampoCep() {
        return campoCep;
    }

    public WebElement getSelectPais() {
        return selectPais;
    }

    public WebElement getCampoInformacao() {
        return campoInformacao;
    }

    public WebElement getCampoTelefone() {
        return campoTelefone;
    }

    public WebElement getCampoCelular() {
        return campoCelular;
    }

    public WebElement getCampoReferencia() {
        return campoReferencia;
    }

    public WebElement getBotaoRegistrar() {
        return botaoRegistrar;
    }

    public WebElement getBotaoMeuEndereco() {
        return botaoMeuEndereco;
    }
}
