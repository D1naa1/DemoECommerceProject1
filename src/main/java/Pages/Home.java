package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.security.PublicKey;

public class Home extends PageBase{
    public Home(WebDriver driver) {
        super(driver);
        JS = (JavascriptExecutor) driver;
    }
    @FindBy(linkText ="Register" )
    WebElement RegisterLink ;

    @FindBy(xpath ="//a[@class='ico-login']")
            WebElement LoginButton ;
    @FindBy(linkText = "My account")
   public WebElement MyAccount ;
@FindBy(id = "small-searchterms")
WebElement Search ;
@FindBy(xpath = "/html/body/div[6]/div[1]/div[2]/div[2]/form/button")
WebElement SearchButton ;

@FindBy(linkText = "Contact us")
WebElement ContactUs ;
@FindBy(id="customerCurrency")
WebElement ChangeCurrency ;
    public void RegisterlinkClick () {
        RegisterLink.click();
    }
public void LoginClick(){
        LoginButton.click();
}
public void SearchFunction (){
        Search.sendKeys("Iphone");
        SearchButton.click();
}
    public void SearchFunction2 (){
        Search.sendKeys("Mac");
        SearchButton.click();
}
    public void SearchSecondProduct () {
        Search.sendKeys("Lenovo IdeaCentre 600 All-in-One PC");
        SearchButton.click();
    }
public void ScrollHome(){
        Scrolling();
}
public void NavigateToContactUs (){
        ContactUs.click();
}
public void ChangeCurrency(){
    Select Currency =new Select(ChangeCurrency);
    Currency.selectByVisibleText("Euro");
}
}
