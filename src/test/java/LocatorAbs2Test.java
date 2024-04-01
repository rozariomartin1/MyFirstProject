import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LocatorAbs2Test extends BaseSetup {
    LocatorAbs2Elements locatorAbs2Elements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.ebay.com/");
        locatorAbs2Elements = PageFactory.initElements(BaseSetup.driver, LocatorAbs2Elements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void locatorAbsCssSelectorTest() {
        locatorAbs2Elements.cssSelectorLocatorAbs1.click();
    }

    @Test(priority = 1)
    void locatorAbsClassTest() {
        locatorAbs2Elements.classLocatorAbs2.click();
    }
}
