package test;

import Pages.ContactUsPage;
import Pages.Home;
import Pages.UserLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
public Home HomeObject ;
public UserLoginPage SignInObject ;
public ContactUsPage ContactUsObject ;
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
public void SendContactUs () throws InterruptedException {
    HomeObject=new Home(driver);
    ContactUsObject =new ContactUsPage(driver);
    HomeObject.NavigateToContactUs();
    ContactUsObject.SendMsgAtContactUs();
    Assert.assertEquals("Your enquiry has been successfully sent to the store owner.",ContactUsObject.ContactUsSuccessMsg.getText());
    Thread.sleep(1000);
}
}
