package pages;

import core.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class PaginaTechnology extends DriverFactory {

    Actions mouseNoMenu = new Actions(pegaDriver());
    WebDriverWait wait = new WebDriverWait(pegaDriver(), 15);
    String elementoWhatWeDo = "li.first.expanded.dropdown-visible.dropdown";
    String linkTechnology = "//*[@id=\"block-system-main-menu\"]//li[4]/a[1]";


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

    }
}
