package test;

import Pages.Home;
import Pages.UserLoginPage;
import Pages.UserSignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.Collections;

public class UserSignUpTest extends TestBase {
    public Home HomeObject;
    public UserLoginPage SignInObject ;
    public UserSignUpPage SignUpObject;


    @Test(priority = 1)
    public void UserRegestration()  {
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
        Assert.assertEquals(expectedResult,ActualResult);
        driver.navigate().forward();


    }
    @Test(priority = 2)
    public void Login (){
        HomeObject = new Home(driver);
        HomeObject.LoginClick();
        SignInObject = new UserLoginPage(driver);
        SignInObject.Login();
        String ActualResult = HomeObject.MyAccount.getText();
        String ExpectedResult = "My account" ;
        Assert.assertEquals(ActualResult,ExpectedResult);
}}