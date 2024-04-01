import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ActionClassTest extends BaseSetup {

    ActionClassElements actionClassElements;

    @BeforeMethod
    void staring() {
        openingBrowser("https://www.ebay.com/");
        actionClassElements = PageFactory.initElements(BaseSetup.driver, ActionClassElements.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void actionClass1Test() {
        Actions action1Test = new Actions(driver);
        action1Test.moveToElement(actionClassElements.ebayGiftCards).build().perform();
    }

    @Test(priority = 1)
    void actionClass2Test() {
        Actions action2Test = new Actions(driver);
        action2Test.moveToElement(actionClassElements.levelUp).click().build().perform();
    }
}
