import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IFrameElements {

    @FindBy(xpath = "//a[@href=\"https://www.google.com/intl/en/about/products\"]")
    WebElement googleApps;

    @FindBy(xpath = "//a[@href=\"https://www.youtube.com\"]")
    WebElement youtube;
}
