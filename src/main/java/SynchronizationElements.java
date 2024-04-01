import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SynchronizationElements {

    @FindBy(xpath = "//input[@id=\"search-field\"]")
    WebElement search;
}
