package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    String email = "diina.A.Mousa@gmail.com" ;
    public Actions action ;
    public JavascriptExecutor JS ;
    public WebDriver driver ;
//Create constructor
    public PageBase (WebDriver driver){

        PageFactory.initElements(driver , this);
    }
    public void Scrolling(){
        JS.executeScript("ScrollBy(0,2500)");
    }
}
