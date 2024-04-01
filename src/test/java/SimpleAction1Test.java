import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleAction1Test extends BaseSetup {
    SimpleAction1Elements simpleAction1Elements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.saucedemo.com/");
        simpleAction1Elements = PageFactory.initElements(BaseSetup.driver, SimpleAction1Elements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void clickTest1() {
        simpleAction1Elements.sauceDemoUsername.sendKeys("standard_user");
        simpleAction1Elements.sauceDemoPassword.sendKeys("secret_sauce");
        simpleAction1Elements.sauceDemoLogin.click();
        simpleAction1Elements.sauceLabsBackpack.click();
        simpleAction1Elements.addToCart.click();
        simpleAction1Elements.shoppingCart.click();
        simpleAction1Elements.checkout.click();
        simpleAction1Elements.checkoutFirstName.sendKeys("John");
        simpleAction1Elements.checkoutLastName.sendKeys("Smith");
        simpleAction1Elements.checkoutPostalCode.sendKeys("12345");
        simpleAction1Elements.checkoutContinue.click();
        simpleAction1Elements.checkoutFinish.click();
    }

    @Test(priority = 1)
    void clickTest2() {
        simpleAction1Elements.sauceDemoUsername.sendKeys("standard_user");
        simpleAction1Elements.sauceDemoPassword.sendKeys("secret_sauce");
        simpleAction1Elements.sauceDemoLogin.click();
        simpleAction1Elements.sauceLabsBikeLight.click();
        simpleAction1Elements.addToCart.click();
        simpleAction1Elements.shoppingCart.click();
        simpleAction1Elements.checkout.click();
        simpleAction1Elements.checkoutFirstName.sendKeys("John");
        simpleAction1Elements.checkoutLastName.sendKeys("Smith");
        simpleAction1Elements.checkoutPostalCode.sendKeys("12345");
        simpleAction1Elements.checkoutContinue.click();
        simpleAction1Elements.checkoutFinish.click();
    }

    @Test(priority = 2)
    void clickTest3() {
        simpleAction1Elements.sauceDemoUsername.sendKeys("standard_user");
        simpleAction1Elements.sauceDemoPassword.sendKeys("secret_sauce");
        simpleAction1Elements.sauceDemoLogin.click();
        simpleAction1Elements.sauceLabsBoltTShirt.click();
        simpleAction1Elements.addToCart.click();
        simpleAction1Elements.shoppingCart.click();
        simpleAction1Elements.checkout.click();
        simpleAction1Elements.checkoutFirstName.sendKeys("John");
        simpleAction1Elements.checkoutLastName.sendKeys("Smith");
        simpleAction1Elements.checkoutPostalCode.sendKeys("12345");
        simpleAction1Elements.checkoutContinue.click();
        simpleAction1Elements.checkoutFinish.click();
    }

    @Test(priority = 3)
    void clickTest4() {
        simpleAction1Elements.sauceDemoUsername.sendKeys("standard_user");
        simpleAction1Elements.sauceDemoPassword.sendKeys("secret_sauce");
        simpleAction1Elements.sauceDemoLogin.click();
        simpleAction1Elements.sauceLabsFleeceJacket.click();
        simpleAction1Elements.addToCart.click();
        simpleAction1Elements.shoppingCart.click();
        simpleAction1Elements.checkout.click();
        simpleAction1Elements.checkoutFirstName.sendKeys("John");
        simpleAction1Elements.checkoutLastName.sendKeys("Smith");
        simpleAction1Elements.checkoutPostalCode.sendKeys("12345");
        simpleAction1Elements.checkoutContinue.click();
        simpleAction1Elements.checkoutFinish.click();
    }

    @Test(priority = 4)
    void clickTest5() {
        simpleAction1Elements.sauceDemoUsername.sendKeys("standard_user");
        simpleAction1Elements.sauceDemoPassword.sendKeys("secret_sauce");
        simpleAction1Elements.sauceDemoLogin.click();
        simpleAction1Elements.sauceLabsOnesie.click();
        simpleAction1Elements.addToCart.click();
        simpleAction1Elements.shoppingCart.click();
        simpleAction1Elements.checkout.click();
        simpleAction1Elements.checkoutFirstName.sendKeys("John");
        simpleAction1Elements.checkoutLastName.sendKeys("Smith");
        simpleAction1Elements.checkoutPostalCode.sendKeys("12345");
        simpleAction1Elements.checkoutContinue.click();
        simpleAction1Elements.checkoutFinish.click();
    }
}
