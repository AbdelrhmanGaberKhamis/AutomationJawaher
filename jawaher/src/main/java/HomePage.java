import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;



public class HomePage extends PageBase
{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    private By LoginBtn=By.cssSelector(
            "body > header > div > div.d-none.d-md-block > div > div:nth-child(3) > div > a");
    private By province=By.cssSelector("#products-categories-mureeh > form > div.d-flex.align-items-center.justify-content-between > div > div:nth-child(1)");
    private By provinceList=By.cssSelector("span[class='select2-results']>ul[class='select2-results__options']");

    private By provinceSearch=By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input");

    private By provinceType=By.xpath("/html/body/span/span/span[2]/ul/li");


    private By city2=By.cssSelector("#content-wrapper > div.container > div > div.col-lg-9 > div > div.top-filters > form > div > div.col-md-10 > div > div:nth-child(2) > div");
    private By cityList2=By.cssSelector("span[class='select2-results']>ul[class='select2-results__options']");
    private By citySearch2=By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input");

    private By cityType2=By.xpath("/html/body/span/span/span[2]/ul");
    private By district=By.cssSelector("#content-wrapper > div.container > div > div.col-lg-9 > div > div.top-filters > form > div > div.col-md-10 > div > div:nth-child(3) > div");

    private By districtList=By.xpath("/html/body/span/span/span[2]/ul");
    private By districtSearch=By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input");
    private By BookNowBtn=By.cssSelector("#products-categories-mureeh > form > div.d-flex.align-items-center.justify-content-between > button");

    private By updateNowBtn=By.cssSelector("#content-wrapper > div.container > div > div.col-lg-9 > div > div.top-filters > form > div > div.col-md-2 > div > button");

    private By country=By.cssSelector("#select2-nationalityIdWeb-container");
    private By countryList=By.cssSelector("body > span > span > span.select2-results");
    private By countrySearch=By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input");

    private By address=By.cssSelector("#step-form > div > div.col-lg-7.pr-md-0 > div > div.step-content-ready-packages > div.addresses-list > div > div:nth-child(3)");

    private By numberOfVisits=By.cssSelector("#step-form > div > div.col-lg-5.pl-md-0 > div > div.form-group.custom-form-group.multiple-selects-form-group.no-visits-select.mb-2 > div > div:nth-child(1) > label");
    private By date=By.xpath("/html/body/div[1]/div[3]/div/div[1]/div/div[2]/form/div/div[2]/div/div[2]/div[1]/div/div/table/tbody/tr[5]/td[4]/a");
    private By nextBtn=By.className("payment-buttons");
    public SignInPage SignInAndRedirect()
    {
        driver.findElement(LoginBtn).click();
        return new SignInPage(driver);
    }
    public void clickOnProvince()
    {
        driver.findElement(province).click();
        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(provinceList));
        wait.until(ExpectedConditions.elementToBeClickable(provinceSearch));
        driver.findElement(provinceSearch).sendKeys("Eastern province");
        driver.findElement(provinceType).click();
    }
    public void clickOnCity()
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        driver.findElement(city2).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(cityList2));
        wait.until(ExpectedConditions.elementToBeClickable(citySearch2));
        try {
            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(citySearch2).sendKeys("Dammam");
        driver.findElement(cityType2).click();
    }

    public void setDistrict()
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        driver.findElement(district).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(districtList));
        wait.until(ExpectedConditions.elementToBeClickable(districtSearch));
        try {
            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(districtSearch).sendKeys("Ad Dab");
        driver.findElement(districtSearch).sendKeys(Keys.BACK_SPACE );
        driver.findElement(districtSearch).sendKeys("bab");
        driver.findElement(districtSearch).sendKeys(Keys.ENTER);
    }
    public void clickOnBookNowBtn()
    {
     driver.findElement(BookNowBtn).click();
    }
    public void clickOnUpdateNowBtn()
    {
        driver.findElement(updateNowBtn).click();
    }
    public void chooseCountryOfExpertise()
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        driver.findElement(country).click();
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(countryList));
        wait.until(ExpectedConditions.elementToBeClickable(countrySearch));
        try {
            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(countrySearch).sendKeys("Philippines");
        driver.findElement(districtSearch).sendKeys(Keys.ENTER);
    }
    public void chooseAdress()
    {
        driver.findElement(address).click();
    }

    public void chooseNumberOfVisits()
    {
        try {
            Thread.sleep(2000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(numberOfVisits).click();
    }
    public void chooseDate()
    {
        try {
            Thread.sleep(3000); // 3000 milliseconds = 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(date).click();
    }
    public checkOutPage clickOnNextBtn()
    {
        wait=new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(ExpectedConditions.elementToBeClickable(nextBtn));
        driver.findElement(nextBtn).click();
        return new checkOutPage(driver);
    }
}
