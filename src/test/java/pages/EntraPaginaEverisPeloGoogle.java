package pages;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class EntraPaginaEverisPeloGoogle extends DriverFactory {

    WebDriverWait wait;

    public void entraLinkEveris(){
        wait = new WebDriverWait(pegaDriver(), 15);
        WebElement linkEveris = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("everis Brazil")));
        linkEveris.click();
    }

    public void validaLinkEveris(){
        wait.until(ExpectedConditions.urlToBe("https://www.everis.com/brazil/pt-br/home-br"));
        String textoUrl = pegaDriver().getCurrentUrl();
        System.out.println(textoUrl);
        assertTrue("Link should contain text 'everis'", textoUrl.contains("everis"));
    }

}
