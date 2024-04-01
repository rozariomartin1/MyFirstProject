import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeysClassTest extends BaseSetup {

    KeysClassElements keysClassElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.costco.com/");
        keysClassElements = PageFactory.initElements(BaseSetup.driver, KeysClassElements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void keysTest1() {
        keysClassElements.search.sendKeys("Samsung TV", Keys.ENTER);
        keysClassElements.search.sendKeys("Grocery", Keys.ENTER);
    }

    @Test(priority = 1)
    void keysTest2() {
        keysClassElements.search.sendKeys("Honey");
        keysClassElements.search.sendKeys(Keys.ADD);
        keysClassElements.search.sendKeys("Nuts");
    }

    @Test(priority = 2)
    void keysTest3() {
        keysClassElements.search.sendKeys("Phoio");
        keysClassElements.search.sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE);
        keysClassElements.search.sendKeys("to", Keys.ENTER);
    }

    @Test(priority = 3)
    void keysTest4() throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }

    @Test(priority = 4)
    void keysTest5() {
        keysClassElements.search.sendKeys("Cookie", Keys.CLEAR);
    }
}
