package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.*;

public class GoogleTestsSteps {

    GooglePesquisaPage googlePesquisaPage = new GooglePesquisaPage();
    GoogleResultadosPage googleResultadosPage = new GoogleResultadosPage();
    HomePageEveris homePageEveris = new HomePageEveris();

    @Dado("que eu navego até a url do google")
    public void que_eu_navego_até_a_url_do_google() {
        googlePesquisaPage.navegaGoogle();
    }

    @Quando("a página é carregada")
    public void a_página_é_carregada() {
        googlePesquisaPage.validaUrlGoogle();
    }

    @Então("eu consigo validar que é a página do google")
    public void eu_consigo_validar_que_é_a_página_do_google() {
        googlePesquisaPage.validaPaginaGoogle();
    }

    @E("eu pesquiso por everis no campo de pesquisa")
    public void eu_pesquiso_por_everis_no_campo_de_pesquisa() {
        googlePesquisaPage.pesquisaEveris();
    }

    @E("clico no botão pesquisar")
    public void clico_no_botão_pesquisar() {
        googlePesquisaPage.realizaScrollBotao();
        googlePesquisaPage.clicarBotaoPesquisa();
    }

    @Então("o texto de destaque aparece no lado direito da página")
    public void o_texto_de_destaque_aparece_no_lado_direito_da_página() {
        googleResultadosPage.capturaTextoDestaque();
        googleResultadosPage.validaTextoDestaqueEveris();
    }

    @Quando("clico no link da everis na lista de resultados")
    public void clico_no_link_da_everis_na_lista_de_resultados() {
        homePageEveris.entraLinkEveris();
    }

    @Então("sou direcionado para a url oficial da everis")
    public void sou_direcionado_para_a_url_oficial_da_everis() {
        homePageEveris.validaLinkEveris();
    }

    @E("clico no link about us da pagina")
    public void clico_no_link_about_us_da_pagina() {
        googleResultadosPage.clicarLinkAbout();
    }

    @Então("o título principal da página é about us")
    public void o_título_principal_da_página_é_about_us() {
        googleResultadosPage.checarTituloLinkAbout();
    }

    @E("passo o mouse sobre o menu what we do")
    public void passo_o_mouse_sobre_o_menu_what_we_do() {
        homePageEveris.mouseHover();
    }

    @E("clico no link technology")
    public void clico_no_link_technology() {
        homePageEveris.clicaLinkTechnology();
    }

    @Então("o título principal da página é technology")
    public void o_título_principal_da_página_é_technology() {
        homePageEveris.validaLinkTechnology();
    }

}
