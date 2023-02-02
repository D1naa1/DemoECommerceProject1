package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase{

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

@FindBy(id="FullName")
    WebElement FullName ;
    @FindBy(id="Email")
    WebElement Email ;
    @FindBy(id="Enquiry")
    WebElement Enquiry ;
    @FindBy(css = "button.button-1.contact-us-button")
    WebElement SubmitButton ;
    @FindBy(css = "div.result")
    public WebElement ContactUsSuccessMsg ;

    public void SendMsgAtContactUs (){
       // FullName.sendKeys("Dina Ahmed");
       // Email.sendKeys("Diina@gmail.com");
        Enquiry.sendKeys("Test");
        SubmitButton.click();
    }
}

