import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleAction2Elements {
    @FindBy(xpath = "//input[@id=\"js-site-search-input\"]")
    WebElement search;
}
