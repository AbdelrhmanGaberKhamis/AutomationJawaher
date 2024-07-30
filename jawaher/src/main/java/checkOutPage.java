import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class checkOutPage extends PageBase{
    public checkOutPage(WebDriver driver) {
        super(driver);
    }
    private By agreeBtn=By.id("terms_and_conditions");
    private By payNowBtn=By.cssSelector("#APSPayment > form");

    public void clickOnAgreeBtn()
    {
        driver.findElement(agreeBtn).click();
    }
    public void clickOnPayNowBtn()
    {
        driver.findElement(payNowBtn).click();
    }
}
