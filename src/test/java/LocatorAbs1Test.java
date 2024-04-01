import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocatorAbs1Test extends BaseSetup {
    LocatorAbs1Elements locatorAbsElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.saucedemo.com/");
        locatorAbsElements = PageFactory.initElements(BaseSetup.driver, LocatorAbs1Elements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void locatorAbsParentChildXpathTest() {
        locatorAbsElements.userName.sendKeys("standard_user");
        locatorAbsElements.password.sendKeys("secret_sauce");
        locatorAbsElements.logIn.click();
        locatorAbsElements.parentChildLocatorAbs1.click();
        locatorAbsElements.parentChildLocatorAbs2.click();
        locatorAbsElements.parentChildLocatorAbs3.click();
        locatorAbsElements.parentChildLocatorAbs4.click();
    }

    @Test(priority = 1)
    void locatorAbsIdTest() {
        locatorAbsElements.userName.sendKeys("standard_user");
        locatorAbsElements.password.sendKeys("secret_sauce");
        locatorAbsElements.logIn.click();
        locatorAbsElements.idLocatorAbs1.click();
        locatorAbsElements.idLocatorAbs2.click();
        locatorAbsElements.idLocatorAbs3.click();
        locatorAbsElements.idLocatorAbs4.click();
    }

    @Test(priority = 2)
    void locatorAbsNameTest() {
        locatorAbsElements.userName.sendKeys("standard_user");
        locatorAbsElements.password.sendKeys("secret_sauce");
        locatorAbsElements.logIn.click();
        locatorAbsElements.nameLocatorAbs1.click();
        locatorAbsElements.nameLocatorAbs2.click();
        locatorAbsElements.nameLocatorAbs3.click();
        locatorAbsElements.nameLocatorAbs4.click();
    }
}
