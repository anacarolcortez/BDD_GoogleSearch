package pages;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class PageAboutUs extends DriverFactory {

    String LinkAboutUs = "//*[@id=\"block-system-main\"]/div/div[1]/div/div[1]/div/div/hgroup/div/div[2]/div/h1";
    WebDriverWait  wait = new WebDriverWait(pegaDriver(), 15);


    public void checarTituloLinkAbout(){
        WebElement tituloLinkAboutUs = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LinkAboutUs)));
        String txtTituloLinkAboutUs = tituloLinkAboutUs.getText();
        System.out.println(txtTituloLinkAboutUs);
        assertTrue("título não é about us", txtTituloLinkAboutUs.equals("about us"));
    }
}
