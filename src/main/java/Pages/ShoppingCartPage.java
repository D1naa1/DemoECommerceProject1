package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCartPage extends PageBase{
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Shopping cart")
    public WebElement ShoppingCartElement;

    @FindBy(linkText = ("(2)"))
    public WebElement CartCount;
    @FindBy (xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[3]/label")
    WebElement TermsAccept ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/form/div[3]/div[2]/div[4]/button")
    public WebElement CheckOutButton ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[1]/h1")
    public WebElement CheckoutHeader ;
    public void ClickShoppingCart (){

        ShoppingCartElement.click();
    }
    public void AcceptTerms (){

        TermsAccept.click();
    }
    public void CheckOutAction (){
        CheckOutButton.click();
    }
}

