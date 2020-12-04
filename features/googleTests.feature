# language: pt

  Funcionalidade: Realizar uma pesquisa no google

    Eu, como Automatizador
    Quero poder realizar uma pesquisa no google
    Para que eu treine a minha automação

  Cenario: Validar página do google carregada
    Dado que eu navego até a url do google
    Quando a página é carregada
    Então eu consigo validar que é a página do google

  Cenario: Pesquisar por Everis no google
    Dado que eu navego até a url do google
    E a página é carregada
    E eu consigo validar que é a página do google
    Quando eu pesquiso por everis no campo de pesquisa
    E clico no botão pesquisar
    Então o texto de destaque aparece no lado direito da página

  Cenario: Validar a url da home do site da everis
    Dado que eu navego até a url do google
    E a página é carregada
    E eu consigo validar que é a página do google
    Quando eu pesquiso por everis no campo de pesquisa
    E clico no botão pesquisar
    E clico no link da everis na lista de resultados
    Então sou direcionado para a url oficial da everis

  Cenario: Clicar no link de about us no site da everis e validar o título principal
    Dado que eu navego até a url do google
    E a página é carregada
    E eu consigo validar que é a página do google
    Quando eu pesquiso por everis no campo de pesquisa
    E clico no botão pesquisar
    E clico no link da everis na lista de resultados
    Então sou direcionado para a url oficial da everis
    E clico no link about us da pagina
    Então o título principal da página é about us

#    Cenário desafio
#  Cenario: Realizar hover no menu what we do, clicar na opção technology e validar texto principal technology no site da everis