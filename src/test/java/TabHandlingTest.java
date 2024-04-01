import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TabHandlingTest extends BaseSetup {

    TabHandlingElements tabHandlingElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.keyfood.com/store/");
        tabHandlingElements = PageFactory.initElements(BaseSetup.driver, TabHandlingElements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void tabHandling1Test() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(tabHandlingElements.facebook).build().perform();
        tabHandlingElements.facebook.click();
        Thread.sleep(1000);
        ArrayList<String> tabs1 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(1));
        Thread.sleep(1000);
        driver.switchTo().window(tabs1.get(0));
    }

    @Test(priority = 1)
    void tabHandling2Test() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(tabHandlingElements.instagram).build().perform();
        tabHandlingElements.instagram.click();
        Thread.sleep(1000);
        ArrayList<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
        driver.switchTo().window(tabs2.get(0));
        tabHandlingElements.facebook.click();
        Thread.sleep(1000);
        ArrayList<String> tabs3 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(1)).close();
        driver.switchTo().window(tabs3.get(2)).close();
    }
}
