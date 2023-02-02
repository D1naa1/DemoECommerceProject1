package test;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareProductTest extends TestBase {

    public Home HomeObject;

    public SearchPage SearchObject;
    public ProductDetailsPage ProductObject;
    public UserLoginPage SignInObject;
    public AddToComparePage CompareObject ;


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
    public void SearchFirstProduct() throws InterruptedException {
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
    public void AddFirstProductToCompare () {
        CompareObject = new AddToComparePage(driver);
        CompareObject.ClickCompareBtn();
    }
    @Test(priority = 5)
    public void SearchItem2() throws InterruptedException {
        HomeObject = new Home(driver);
        SearchObject = new SearchPage(driver);
        HomeObject.SearchSecondProduct();
        String ExpectedResult = "Lenovo IdeaCentre 600 All-in-One PC";
        String ActualResult = SearchObject.Lenovo.getText();
        Assert.assertEquals(ActualResult, ExpectedResult);
        Thread.sleep(1000);
    }
    @Test(priority = 6)
    public void SecondProductdetailsScreen() {
        ProductObject = new ProductDetailsPage(driver);
        ProductObject.NavigateToSecondProduct();
    }
    @Test(priority = 7)
    public void AddSecondProductToCompare () throws InterruptedException {
        CompareObject =new AddToComparePage(driver);
        CompareObject.ClickCompareBtn();
        Thread.sleep(1000);
    }
    @Test(priority = 8)
    public void CompareScreen (){
        CompareObject =new AddToComparePage(driver);
        CompareObject.NavigateToCompareScreen();
        Assert.assertEquals("€430.00",CompareObject.FirstPrice.getText());
        Assert.assertEquals("€1548.00",CompareObject.SecondPrice.getText());


}}