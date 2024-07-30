import org.testng.Assert;
import org.testng.annotations.Test;

public class bookNow extends TestBase{
@Test
public void BookNowScenario()
{
    homePage.SignInAndRedirect();
    signInPage.EnterMobileNumber();
    signInPage.clickOnConfirmationCode();
    signInPage.EnterConfirmationCode();
    signInPage.ClickOnConfirmMobileNumber();
    homePage.clickOnProvince();
    homePage.clickOnBookNowBtn();
    homePage.clickOnCity();
    homePage.setDistrict();
    homePage.clickOnUpdateNowBtn();
    homePage.chooseCountryOfExpertise();
    homePage.chooseAdress();
    homePage.chooseNumberOfVisits();
    homePage.chooseDate();
    homePage.clickOnNextBtn();
    checkOutPage.clickOnAgreeBtn();
    checkOutPage.clickOnPayNowBtn();
}
}
