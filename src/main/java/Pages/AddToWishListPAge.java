package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishListPAge extends PageBase{
    public AddToWishListPAge(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="add-to-wishlist-button-4")
    WebElement AddToWishListButton ;
    @FindBy(xpath = "/html/body/div[5]/div/p")
    public WebElement ProdcutAddedSuccessMsg ;

    public void AddToWishList (){
        AddToWishListButton.click();
    }

}

