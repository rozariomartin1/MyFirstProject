import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LocatorAbs1Elements {

    @FindBy(xpath = "//input[@id=\"user-name\"]")
    WebElement userName;

    @FindBy(xpath = "//input[@id=\"password\"]")
    WebElement password;

    @FindBy(xpath = "//input[@id=\"login-button\"]")
    WebElement logIn;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button")
    WebElement parentChildLocatorAbs1;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[2]/div[2]/div[2]/button")
    WebElement parentChildLocatorAbs2;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[3]/div[2]/div[2]/button")
    WebElement parentChildLocatorAbs3;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[4]/div[2]/div[2]/button")
    WebElement parentChildLocatorAbs4;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement idLocatorAbs1;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement idLocatorAbs2;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement idLocatorAbs3;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement idLocatorAbs4;

    @FindBy(name = "add-to-cart-sauce-labs-backpack")
    WebElement nameLocatorAbs1;

    @FindBy(name = "add-to-cart-sauce-labs-bike-light")
    WebElement nameLocatorAbs2;

    @FindBy(name = "add-to-cart-sauce-labs-bolt-t-shirt")
    WebElement nameLocatorAbs3;

    @FindBy(name = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement nameLocatorAbs4;
}
