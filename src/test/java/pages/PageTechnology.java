package pages;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class PageTechnology extends DriverFactory {

    WebDriverWait wait = new WebDriverWait(pegaDriver(), 15);
    WebElement tituloLinkTechnology;
    String headerTechnology = "//*[@id=\"header_bgmedia\"]/div/div/hgroup/div/div[2]/div/h1";

    public void validaLinkTechnology(){
        tituloLinkTechnology = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(headerTechnology)));
        String txtTituloLinkAboutUs = tituloLinkTechnology.getText();
        System.out.println(txtTituloLinkAboutUs);
        assertTrue("título não é technology", txtTituloLinkAboutUs.equals("technology"));
    }
}
