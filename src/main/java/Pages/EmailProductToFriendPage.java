package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailProductToFriendPage extends PageBase{
    public EmailProductToFriendPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath= "/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[9]/div[3]/button")
    WebElement EmailProductBtn ;
    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    public WebElement ProductName ;
    @FindBy(id="FriendEmail")
    WebElement FriendEmail ;
    @FindBy(id="YourEmailAddress")
    WebElement MyEmail ;
    @FindBy(id="PersonalMessage")
    WebElement PersonalMsg ;
    @FindBy(css = "button.button-1.send-email-a-friend-button")
    WebElement SendEmailBtn ;
    @FindBy(css = "div.result")
    public WebElement SuccessMsg ;

    public void ClickEmailProductBtn (){
        EmailProductBtn.click();
    }
    public void AddData (){
        FriendEmail.sendKeys("eng1dina1@gmail.com");
        PersonalMsg.sendKeys("This product is amazing, Pls check it");
        SendEmailBtn.click();

    }

}
