package pages;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static org.junit.Assert.assertTrue;


public class PaginaTechnology extends DriverFactory {

    Actions mouseNoMenu = new Actions(pegaDriver());
    WebDriverWait wait = new WebDriverWait(pegaDriver(), 15);
    String elementoWhatWeDo = "li.first.expanded.dropdown-visible.dropdown";
    String linkTechnology = "//*[@id=\"block-system-main-menu\"]//li[4]/a[1]";
    String headerTechnology = "//*[@id=\"header_bgmedia\"]/div/div/hgroup/div/div[2]/div/h1";
    WebElement tituloLinkTechnology;

    public void mouseHover(){
        WebElement menu = pegaDriver().findElement(By.cssSelector(elementoWhatWeDo));
        System.out.println(menu);
        mouseNoMenu.moveToElement(menu).perform();
    }

    public void clicaLinkTechnology(){
        WebElement link = pegaDriver().findElement(By.xpath(linkTechnology));
        link.click();
    }

    public void validaLinkTechnology(){
        tituloLinkTechnology = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(headerTechnology)));
        String txtTituloLinkAboutUs = tituloLinkTechnology.getText();
        System.out.println(txtTituloLinkAboutUs);
        assertTrue("título não é technology", txtTituloLinkAboutUs.equals("technology"));
    }
}
