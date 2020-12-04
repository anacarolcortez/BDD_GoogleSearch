package pages;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class EntraLinkAboutUsEveris extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(pegaDriver(), 15);
    String menuLinkAboutUs = "//*[@id=\"block-system-main-menu\"]/ul/li[4]/a";
    String LinkAboutUs = "//*[@id=\"block-system-main\"]/div/div[1]/div/div[1]/div/div/hgroup/div/div[2]/div/h1";
    WebElement tituloLinkAboutUs;

    public void clicarLinkAbout(){
        WebElement linkAboutUs = pegaDriver().findElement(By.xpath(menuLinkAboutUs));
        linkAboutUs.click();
    }

    public void checarTituloLinkAbout(){
        tituloLinkAboutUs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LinkAboutUs)));
        String txtTituloLinkAboutUs = tituloLinkAboutUs.getText();
        System.out.println(txtTituloLinkAboutUs);
        assertTrue("título não é about us", txtTituloLinkAboutUs.equals("about us"));
    }
}
