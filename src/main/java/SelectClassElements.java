import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectClassElements {

    @FindBy(xpath = "//select[@id=\"gh-cat\"]")
    WebElement allCategories;

    @FindBy(xpath = "//div[@id=\"mainContent\"]/div[1]/ul/li[3]")
    WebElement motors;

    @FindBy(xpath = "//a[@href=\"https://www.ebay.com/b/Classics/bn_7005623268\"]")
    WebElement motorsClassic;
}
