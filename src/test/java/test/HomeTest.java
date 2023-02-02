package test;

import Pages.Home;
import Pages.SearchPage;
import Pages.UserLoginPage;
import Pages.UserSignUpPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Currency;

public class HomeTest extends TestBase{
    public Home HomeObject ;
    public UserSignUpPage SignUpObject ;
    public SearchPage SearchObject ;
    public UserLoginPage SignInObject;
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
    public void ChangeCurrency(){
        HomeObject=new Home(driver) ;
        HomeObject.ChangeCurrency();
    }

    @Test(priority = 3)
    public void SearchItem () throws InterruptedException {
        HomeObject = new Home(driver);
        SearchObject = new SearchPage(driver);
        HomeObject.SearchFunction2();
        String ExpectedResult = SearchObject.Price.getText();
        Assert.assertEquals("€1548.00",ExpectedResult);
       Thread.sleep(1000);

    }

}
