package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends PageBase{
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "PDF Invoice")
    public WebElement PDFInvoice ;

    public void PdfInvoiceClick (){
        PDFInvoice.click();
    }
}
