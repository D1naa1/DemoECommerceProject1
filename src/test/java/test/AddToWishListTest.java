package test;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToWishListTest extends TestBase {
    public Home HomeObject;
    public UserLoginPage SignInObject;
    public SearchPage SearchObject;
    public AddToWishListPAge WishListtObject;
    public ProductDetailsPage ProductObject;

    @Test(priority = 1)
    public void Login() {
        HomeObject = new Home(driver);
        HomeObject.LoginClick();
        SignInObject = new UserLoginPage(driver);
        SignInObject.Login();
        String ActualResult = HomeObject.MyAccount.getText();
        String ExpectedResult = "My account";
        Assert.assertEquals(ActualResult, ExpectedResult);
    }

    @Test(priority = 2)
    public void SearchItem2() throws InterruptedException {
        HomeObject = new Home(driver);
        SearchObject = new SearchPage(driver);
        HomeObject.SearchFunction2();
        String ExpectedResult = "Apple MacBook Pro 13-inch";
        String ActualResult = SearchObject.Mac.getText();
        Assert.assertEquals(ActualResult, ExpectedResult);
        Thread.sleep(1000);
    }

    @Test(priority = 3)
    public void ProductdetailsScreen() {
        ProductObject = new ProductDetailsPage(driver);
        ProductObject.NavigateToProduct();
        Assert.assertEquals("ADD TO CART", ProductObject.AddToCartButton.getText());
    }
    @Test(priority = 4)
    public void AddToWishList () throws InterruptedException {
        WishListtObject = new AddToWishListPAge(driver);
        WishListtObject.AddToWishList();
        Assert.assertEquals("The product has been added to your wishlist",WishListtObject.ProdcutAddedSuccessMsg.getText());
        Thread.sleep(1000);
    }




}

