package test;

import Pages.Home;
import Pages.ProductDetailsPage;
import Pages.SearchPage;
import Pages.UserSignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductDetailsTest extends TestBase {
    public Home HomeObject;
    public SearchPage SearchObject;
    public UserSignUpPage SignUpObject;
    public ProductDetailsPage ProductObject;
    @Test
    public void UserRegestration() {
        HomeObject = new Home(driver);
        SignUpObject = new UserSignUpPage(driver);
        HomeObject.RegisterlinkClick();
        SignUpObject.UserRegestration();
        SignUpObject.SelectDay();
        SignUpObject.SelectMonth();
        SignUpObject.SelectYear();
        SignUpObject.Registerbutton();

        String expectedResult = "Your registration completed";
        String ActualResult = SignUpObject.SuccessRegistrationMsg.getText();
        Assert.assertEquals(expectedResult, ActualResult);
    }
@Test(priority = 1)
    public void SearchItem2() {
        HomeObject = new Home(driver);
        SearchObject = new SearchPage(driver);
        HomeObject.SearchFunction2();
        String ExpectedResult = "Apple MacBook Pro 13-inch";
        String ActualResult = SearchObject.Mac.getText();
        Assert.assertEquals(ActualResult, ExpectedResult);
    }
    @Test(priority = 2)
    public void ProductdetailsScreen(){
    ProductObject=new ProductDetailsPage(driver);
    ProductObject.NavigateToProduct();
    Assert.assertEquals("ADD TO CART",ProductObject.AddToCartButton.getText());

    }
    @Test(priority = 3)
    public void AddProductToCart(){
    ProductObject=new ProductDetailsPage(driver);
    ProductObject.AddToTheCart();
    String ExpectedResult= "The product has been added to your shopping cart";
    Assert.assertEquals(ExpectedResult,ProductObject.SucessAddItemMsg.getText());
    }
}