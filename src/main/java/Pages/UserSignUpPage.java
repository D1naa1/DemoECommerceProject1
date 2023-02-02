package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class UserSignUpPage extends PageBase {
    public UserSignUpPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[1]/div/span[2]/label")
    WebElement ChooseGender;

    @FindBy(xpath = "//input[@name='FirstName']")
    WebElement AddName;

    @FindBy(xpath = "//input[@name='LastName']")
    WebElement AddSecondName;

    @FindBy(xpath = "//select[@name='DateOfBirthDay']")
    WebElement SelectDateOfBirthDay;

    @FindBy(xpath = "//select[@name='DateOfBirthMonth']")
    WebElement SelectDateOfBirthMonth;

    @FindBy(xpath = "//select[@name='DateOfBirthYear']")
    WebElement SelectDateOfBirthYear;

    @FindBy(xpath = "//input[@type='email']")
    WebElement AddEmail;

    @FindBy(xpath = "//input[@id='Company']")
    WebElement AddCompanyName;

    @FindBy(xpath = "//label[@for='Newsletter']")
    WebElement Newsletter;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement AddPassword;

    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement AddConfirmPassword;

    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;
    @FindBy(css = "div.result")
    public WebElement SuccessRegistrationMsg;
    @FindBy(linkText = "Continue")
    WebElement ContinueButton;
    @FindBy(linkText = "Log out")
    WebElement LogOut ;

    public void UserRegestration() {
        ChooseGender.click();
        AddName.sendKeys("Dina");
        AddSecondName.sendKeys("Ahmed");
        AddEmail.sendKeys(email);
        AddCompanyName.sendKeys("InovaLLC");
        Newsletter.click();
        AddPassword.sendKeys("12345678");
        AddConfirmPassword.sendKeys("12345678");

    }

    public void SelectDay() {
        Select day = new Select(SelectDateOfBirthDay);
        day.selectByVisibleText("4");
    }

    public void SelectMonth() {
        Select Month = new Select(SelectDateOfBirthMonth);
        Month.selectByVisibleText("April");
    }

    public void SelectYear() {
        Select Year = new Select(SelectDateOfBirthYear);
        Year.selectByVisibleText("2020");
    }

    public void Registerbutton() {
        RegisterButton.click();
    }
    public void SignOut (){
        LogOut.click();
    }

}
