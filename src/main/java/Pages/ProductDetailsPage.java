package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBase {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    public WebElement MacProduct;
    @FindBy(linkText = "Lenovo IdeaCentre 600 All-in-One PC")
    public WebElement LenovoProduct ;
    @FindBy(id = "add-to-cart-button-4")
    public WebElement AddToCartButton;

    @FindBy(xpath = " /html/body/div[5]/div/p")
    public WebElement SucessAddItemMsg;

    public void NavigateToProduct() {
        MacProduct.click();

    }
    public void NavigateToSecondProduct (){
        LenovoProduct.click();
    }

    public void AddToTheCart() {
        AddToCartButton.click();
    }
}
