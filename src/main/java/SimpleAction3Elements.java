import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleAction3Elements {

    @FindBy(xpath = "//input[@id=\"register.firstName\"]")
    WebElement firstName;

    @FindBy(xpath = "//input[@id=\"register.lastName\"]")
    WebElement lastName;

    @FindBy(xpath = "//input[@id=\"register.email\"]")
    WebElement registerEmail;

    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//input[@id=\"register.checkPwd\"]")
    WebElement registerCheckPassword;
}
