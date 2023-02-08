package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public WebDriver driver;

@BeforeClass
    public void StartDriver (){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterClass
    public void QuitDriver(){
    driver.quit();
    }

    public static class AddToWishListTest {
    }
}
