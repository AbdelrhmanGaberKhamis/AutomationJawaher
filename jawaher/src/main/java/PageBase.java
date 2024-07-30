import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PageBase {
    protected WebDriver driver;
    WebDriverWait wait;
    public PageBase(WebDriver driver) {
        this.driver = driver;
    }
}
