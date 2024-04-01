import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleAction1Elements extends BaseSetup{

    @FindBy(xpath = "//button[@id=\"checkout\"]")
    WebElement checkout;

    @FindBy(xpath = "//button[@name=\"add-to-cart\"]")
    WebElement addToCart;

    @FindBy(xpath = "//div[@id=\"shopping_cart_container\"]")
    WebElement shoppingCart;

    @FindBy(xpath = "//input[@id=\"first-name\"]")
    WebElement checkoutFirstName;

    @FindBy(xpath = "//input[@id=\"last-name\"]")
    WebElement checkoutLastName;

    @FindBy(xpath = "//input[@id=\"postal-code\"]")
    WebElement checkoutPostalCode;

    @FindBy(xpath = "//input[@id=\"continue\"]")
    WebElement checkoutContinue;

    @FindBy(xpath = "//button[@id=\"finish\"]")
    WebElement checkoutFinish;

    @FindBy(xpath = "//input[@id=\"user-name\"]")
    WebElement sauceDemoUsername;

    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement sauceDemoPassword;

    @FindBy(xpath = "//input[@name=\"login-button\"]")
    WebElement sauceDemoLogin;

    @FindBy(xpath = "//a[@id=\"item_4_title_link\"]")
    WebElement sauceLabsBackpack;

    @FindBy(xpath = "//a[@id=\"item_0_title_link\"]")
    WebElement sauceLabsBikeLight;

    @FindBy(xpath = "//a[@id=\"item_1_title_link\"]")
    WebElement sauceLabsBoltTShirt;

    @FindBy(xpath = "//a[@id=\"item_5_title_link\"]")
    WebElement sauceLabsFleeceJacket;

    @FindBy(xpath = "//a[@id=\"item_2_title_link\"]")
    WebElement sauceLabsOnesie;
}
