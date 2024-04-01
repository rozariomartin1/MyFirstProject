import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabHandlingElements {

    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/keyfood\"]/img")
    WebElement facebook;

    @FindBy(xpath = "//a[@href=\"https://www.instagram.com/keyfood\"]/img")
    WebElement instagram;
}
