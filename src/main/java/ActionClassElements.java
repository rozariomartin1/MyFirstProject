import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActionClassElements {

    @FindBy(xpath = "//div[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[7]")
    WebElement ebayGiftCards;

    @FindBy(xpath = "//div[@id=\"mainContent\"]/div[4]/div[2]")
    WebElement levelUp;
}
