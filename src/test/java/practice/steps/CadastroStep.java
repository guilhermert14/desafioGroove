package practice.steps;

import io.cucumber.java.pt.*;
import practice.funcionalidades.CadastroFuncionalidade;

public class CadastroStep {

    private CadastroFuncionalidade cadastroFuncionalidade = new CadastroFuncionalidade();

    @Dado("que estou no site {string}")
    public void queEstouNoSite(String url) {
        cadastroFuncionalidade.inicializarWeb(url);
    }


    @Quando("realizo um cadastro")
    public void realizoUmCadastro() {
        cadastroFuncionalidade.preencherCadastro();
    }

    @Entao("visualizo o cadastro efetuado com sucesso")
    public void visualizoOCadastroEfetuadoComSucesso() {

    }
}
