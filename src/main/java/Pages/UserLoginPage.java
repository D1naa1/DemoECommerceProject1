package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserLoginPage extends PageBase{
    public UserLoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//input[@type='email']")
    WebElement AddMail ;
    @FindBy(xpath = "//input[@id='Password']")
    WebElement AddPassword ;
    @FindBy(xpath = "//label[@for='RememberMe']")
    WebElement RememberMe ;
    @FindBy(xpath = "//button[@class='button-1 login-button']")
    WebElement LoginButton ;

public void Login () {
    AddMail.sendKeys(email);
    AddPassword.sendKeys("12345678");
    RememberMe.click();
    LoginButton.click();
}
}
