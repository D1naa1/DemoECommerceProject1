package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.xml.xpath.XPath;


public class HoverMenuPage extends PageBase{

    public HoverMenuPage(WebDriver driver) {
        super(driver);
        action=new Actions(driver);
    }
    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    WebElement ComputersElement ;
    @FindBy(xpath ="/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a")
    WebElement NoteBooksElement ;
    @FindBy(xpath = "//h1[text()='Notebooks']")
    public WebElement NoteBooksTitle ;

    public void HoverMenu (){
        action.moveToElement(ComputersElement).moveToElement(NoteBooksElement).click().build().perform();






            }
        }


