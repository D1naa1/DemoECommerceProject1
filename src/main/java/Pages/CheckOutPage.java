package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends PageBase{
    public CheckOutPage(WebDriver driver) {
        super(driver);
    }
    //Billing Address Data
    @FindBy (id="BillingNewAddress_CountryId")
    WebElement CountryDropDownList ;
    @FindBy(id="BillingNewAddress_StateProvinceId")
    WebElement StateDropDownList ;
    @FindBy(id="BillingNewAddress_City")
    WebElement CityTextBox ;
    @FindBy(id="BillingNewAddress_Address1")
    WebElement FirstAddress ;
    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement PostalCode ;
    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement PhoneNumber ;
    @FindBy(css = "button.button-1.new-address-next-step-button")
    WebElement ContinueButton ;

    //Shipping Address data
    @FindBy(xpath ="//label[text()='Next Day Air ($0.00)']")
    public WebElement ShippingMethodOption ;
    @FindBy(css="button.button-1.shipping-method-next-step-button")
    WebElement ContinueBtn ;
//Payment Method data
    @FindBy(xpath = "//div[text()='Pay by cheque or money order']")
    public WebElement PaymentMethodOption ;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button")
    WebElement ContinueButtonForPaymet ;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/form/div/div/div/div/table/tbody/tr/td/p[1]")
    public WebElement SucessChoosePaymentMethod ;

    //Data Confirmation
    @FindBy(css="button.button-1.payment-info-next-step-button")
    WebElement NavigateToConfirmOrderBtn ;

    //Confirm Order
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[1]/div/div/div/form/div[3]/div/div/table/tbody/tr[4]/td[1]")
    public WebElement Total ;
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button")
    WebElement ContinueConfirmOrder ;

    //Success Confirm Order Msgs
    @FindBy(linkText = "Click here for order details.")
    public WebElement OrderdetailsLinkedTxt ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")
    public WebElement Msg2 ;


    public void ChooseCountry (){
        Select Country= new Select(CountryDropDownList);
        Country.selectByVisibleText("Egypt");
    }
    public void ChooseState (){
        Select State= new Select(StateDropDownList);
        State.selectByVisibleText("Other");
    }
public void CompleteDate (){
        CityTextBox.sendKeys("Alexandria");
        FirstAddress.sendKeys("Louran");
        PostalCode.sendKeys("12345");
        PhoneNumber.sendKeys("01009999999");
        ContinueButton.click();
}
public void ShippingOption (){
        ShippingMethodOption.click();
        ContinueBtn.click();
}
public void ChoosePaymentMethod (){
        PaymentMethodOption.click();
        ContinueButtonForPaymet.click();
}
public void ConfirmData (){
        NavigateToConfirmOrderBtn.click();
}
public void ConfirmOrder (){

        ContinueConfirmOrder.click();
}
public void OrderDetails (){
        OrderdetailsLinkedTxt.click();
}
}
