import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertElements {

    @FindBy(xpath = "//button[@id=\"alertButton\"]")
    WebElement alertButton;

    @FindBy(xpath = "//button[@id=\"timerAlertButton\"]")
    WebElement timeAlertButton;

    @FindBy(xpath = "//button[@id=\"confirmButton\"]")
    WebElement confirmButton;

    @FindBy(xpath = "//button[@id=\"promtButton\"]")
    WebElement promtButton;
}
