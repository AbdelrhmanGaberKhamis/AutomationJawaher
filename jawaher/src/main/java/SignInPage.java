import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage extends PageBase
{
    public SignInPage(WebDriver driver) {
        super(driver);
    }
    private By mobileField= By.cssSelector("body > div.content > div > div > form > div.form-group > input");
    private By confirmationCodeBtn=By.cssSelector("body > div.content > div > div > form > div.d-flex.flex-column > button");
    private By otpField=By.cssSelector("body > div.content > div > div > div > form:nth-child(1) > div.form-group > input");
    private By ConfirmMobileNumber=By.cssSelector("body > div.content > div > div > div > form:nth-child(1) > div.d-flex.flex-column > button");

    public void EnterMobileNumber()
    {
        driver.findElement(mobileField).sendKeys("0502010110 ");
    }
    public void clickOnConfirmationCode()
    {
        driver.findElement(confirmationCodeBtn).click();
    }
    public void EnterConfirmationCode()
    {
        driver.findElement(otpField).sendKeys("1234");
    }
    public void ClickOnConfirmMobileNumber()
    {
        driver.findElement(ConfirmMobileNumber).click();
    }

}
