package test;

import Pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckOutTest extends TestBase {
    public ShoppingCartPage CartObject;
    public Home HomeObject;
    public UserSignUpPage SignUpObject;
    public SearchPage SearchObject;
    public ProductDetailsPage ProductObject;
    public UserLoginPage SignInObject;
    public CheckOutPage CheckOutObject;
public OrderDetailsPage OrderDetailsObject ;
    @Test
    public void UserRegestration() {
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
        Assert.assertEquals(expectedResult, ActualResult);
    }

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
    public void AddProductToCart() {
        ProductObject = new ProductDetailsPage(driver);
        ProductObject.AddToTheCart();
        String ExpectedResult = "The product has been added to your shopping cart";
        Assert.assertEquals(ExpectedResult, ProductObject.SucessAddItemMsg.getText());
    }

    @Test(priority = 5)
    public void NavigateToCart() {
        CartObject = new ShoppingCartPage(driver);
        CartObject.ClickShoppingCart();
        Assert.assertEquals("CHECKOUT", CartObject.CheckOutButton.getText());
    }

    @Test(priority = 6)
    public void ClickCheckOut() {
        CartObject = new ShoppingCartPage(driver);
        CartObject.AcceptTerms();
        CartObject.CheckOutAction();
        Assert.assertEquals("Checkout", CartObject.CheckoutHeader.getText());

    }

    @Test(priority = 7)
    public void CompleteMissingData() throws InterruptedException {
        CheckOutObject = new CheckOutPage(driver);
        CheckOutObject.ChooseCountry();
        CheckOutObject.ChooseState();
        CheckOutObject.CompleteDate();
        Assert.assertEquals("Next Day Air ($0.00)", CheckOutObject.ShippingMethodOption.getText());
        Thread.sleep(1000);

    }

    @Test(priority = 8)
    public void ChoosePayment() throws InterruptedException {
        CheckOutObject = new CheckOutPage(driver);
        CheckOutObject.ShippingOption();
        Assert.assertEquals("Pay by cheque or money order", CheckOutObject.PaymentMethodOption.getText());
        Thread.sleep(1000);
    }

    @Test(priority = 9)
    public void ChoosePaymentAndContine() throws InterruptedException {
        CheckOutObject = new CheckOutPage(driver);
        CheckOutObject.ChoosePaymentMethod();
        Assert.assertEquals("Mail Personal or Business Check, Cashier's Check or money order to:", CheckOutObject.SucessChoosePaymentMethod.getText());
        Thread.sleep(1000);
        CheckOutObject.ConfirmData();
        Assert.assertEquals("Total:", CheckOutObject.Total.getText());
        System.out.println(CheckOutObject.Total.getText());
    }

    @Test(priority = 10)
    public void OrderPlacedSucess() throws InterruptedException {
        CheckOutObject = new CheckOutPage(driver);
        CheckOutObject.ConfirmOrder();
        Assert.assertEquals("Click here for order details.", CheckOutObject.OrderdetailsLinkedTxt.getText());
        Thread.sleep(1000);
    }
@Test(priority = 11)
public void OrderDetails(){
    CheckOutObject = new CheckOutPage(driver);
    OrderDetailsObject=new OrderDetailsPage(driver);
    CheckOutObject.OrderDetails();
    Assert.assertEquals("PDF Invoice",OrderDetailsObject.PDFInvoice.getText());
}
@Test(priority = 12)
    public void DownloadPdf() throws InterruptedException {
        OrderDetailsObject = new OrderDetailsPage(driver);
        OrderDetailsObject.PdfInvoiceClick();
        Thread.sleep(1000);
}
@Test(priority = 13)
    public void Logout (){
        SignUpObject =new UserSignUpPage(driver);
        SignUpObject.SignOut();
}

}


