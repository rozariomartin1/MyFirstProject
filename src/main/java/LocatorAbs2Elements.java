import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorAbs2Elements {

    @FindBy(css = "[href=\"https://www.ebayinc.com/\"]")
    WebElement cssSelectorLocatorAbs1;

    @FindBy(className = "gh-control")
    WebElement classLocatorAbs2;
}
