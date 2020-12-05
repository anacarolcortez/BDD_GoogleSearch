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
    String linkTechnology = "//*[@id=\"block-system-main-menu\"]/ul/li[1]/ul/li[4]/a";


    public void mouseHover(){
        WebElement menu = pegaDriver().findElement(By.cssSelector(elementoWhatWeDo));
        System.out.println(menu);
        mouseNoMenu.moveToElement(menu).perform();
    }

    public void clicaLinkTechnology(){
        List<WebElement> links = pegaDriver().findElements(By.cssSelector(".collapsed"));
        WebElement linkTechnology = links.stream().filter(link -> link.getText().equals("technology"));
        linkTechnology.click();
    }

    public void validaLinkTechnology(){

    }
}
