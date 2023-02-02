package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToComparePage extends PageBase{
    public AddToComparePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "button.button-2.add-to-compare-list-button")
    WebElement AddToCompareBtn ;
    @FindBy(xpath = "/html/body/div[5]/div/p/a")
    WebElement CompareLinkedtxt ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[2]")
    public WebElement FirstPrice ;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[4]/td[3]")
    public WebElement SecondPrice ;


    public void ClickCompareBtn(){
        AddToCompareBtn.click();
    }
public void NavigateToCompareScreen (){
        CompareLinkedtxt.click();
}
}
