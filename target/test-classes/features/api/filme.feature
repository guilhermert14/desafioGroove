#language: pt
#enconding: UTF-8
#Author: Guilherme Teixeira

  Funcionalidade: Realizar um get na api "https://swapi.co/api/films/"

    Cenario: Validar o filmes filtrando pelo diretor "George Lucas" e que contenha o produtor "Rick McCallum"
      Dado que realizo um get na api "https://swapi.co/api/films/"
      Quando filtro o filme pelo diretor "George Lucas" e contenha o produtor "Rick McCallum"
      Entao valido os filmes