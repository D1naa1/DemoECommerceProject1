package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[2]/div")
    public WebElement NoResult ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")
    public WebElement Mac ;
    @FindBy(xpath ="/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div[3]/div[1]/span")
    public WebElement Price ;
    @FindBy(linkText = "Lenovo IdeaCentre 600 All-in-One PC")
    public WebElement Lenovo ;
    public void GetPrice (){
        Price.getText();
    }
}

