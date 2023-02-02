package test;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmailProductToFriendTest extends TestBase{
    public Home HomeObject;
    public UserLoginPage SignInObject ;
    public  SearchPage SearchObject ;
    public EmailProductToFriendPage EmailProductObject ;
    public ProductDetailsPage ProductObject ;
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
    public void NavigateToEmailPage (){
        EmailProductObject = new EmailProductToFriendPage(driver);
        EmailProductObject.ClickEmailProductBtn();
        Assert.assertEquals("Apple MacBook Pro 13-inch",EmailProductObject.ProductName.getText());


    }
    @Test(priority = 5)
    public void EmailData (){
        EmailProductObject = new EmailProductToFriendPage(driver);
        EmailProductObject.AddData();
        Assert.assertEquals("Your message has been sent.",EmailProductObject.SuccessMsg.getText());

}}
