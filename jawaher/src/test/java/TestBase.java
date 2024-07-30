import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.*;
import io.qameta.allure.Step;
import io.qameta.allure.Attachment;
public class TestBase {
    protected WebDriver driver = new ChromeDriver();
    protected HomePage homePage;
    protected SignInPage signInPage;
    protected checkOutPage checkOutPage;

    @BeforeTest
    public void Setup() {

        driver.manage().window().maximize();
        driver.get("https://jawahrecmsweb.just4share.com/en");
        homePage = new HomePage(driver);
        signInPage = new SignInPage(driver);
        checkOutPage= new checkOutPage(driver);
    }

}
