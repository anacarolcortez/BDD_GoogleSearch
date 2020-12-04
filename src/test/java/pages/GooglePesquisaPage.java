package pages;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class GooglePesquisaPage extends DriverFactory {

    static WebDriverWait wait;
    static WebElement pesquisaGoogle;
    static WebElement botaoPesquisaGoogle;
    String elementoPesquisaGoogle = "q";
    String elementoBotaoPesquisa = "btnK";

    public void navegaGoogle(){
        wait = new WebDriverWait(pegaDriver(), 15);
        pegaDriver().get("https://www.google.com");
        pegaDriver().manage().window().maximize();
    }

    public void validaUrlGoogle(){
        assertTrue("url não carregou", pegaDriver().getCurrentUrl().contains("google"));
    }

    public void validaPaginaGoogle(){
        assertTrue("palavra pesquisa não apareceu", pegaDriver().getPageSource().contains("Pesquisa"));
    }

    public void pesquisaEveris(){
        pesquisaGoogle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(elementoPesquisaGoogle)));
        pesquisaGoogle.sendKeys("Everis");
    }

    public void realizaScrollBotao(){
        botaoPesquisaGoogle = wait.until(ExpectedConditions.elementToBeClickable(By.name(elementoBotaoPesquisa)));
        ((JavascriptExecutor)pegaDriver()).executeScript("arguments[0].scrollIntoView(true);", botaoPesquisaGoogle);
    }

    public void clicarBotaoPesquisa(){
        botaoPesquisaGoogle.click();
    }

}
