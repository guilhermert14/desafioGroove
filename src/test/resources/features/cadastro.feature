#language: pt
#enconding: UTF-8
#Author: Guilherme Teixeira

  Funcionalidade: Realizar um cadastro no site automationpractice"

    @web @cadastro
    Cenario: Validar um cadastro
      Dado que estou no site "http://automationpractice.com"
      E clico no link "Sign in"
      Quando realizo um cadastro
      Entao visualizo o cadastro efetuado com sucesso