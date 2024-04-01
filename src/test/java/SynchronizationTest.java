import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SynchronizationTest extends BaseSetup {

    SynchronizationElements synchronizationElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.costco.com/");
        synchronizationElements = PageFactory.initElements(BaseSetup.driver, SynchronizationElements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void threadWaitTest() throws InterruptedException {
        synchronizationElements.search.sendKeys("Grocery");
        Thread.sleep(4000);
        synchronizationElements.search.sendKeys(Keys.ENTER);
        Thread.sleep(4000);
    }

    @Test(priority = 1)
    void implicitWaitTest() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        synchronizationElements.search.sendKeys("Grocery", Keys.ENTER);
    }

    @Test(priority = 2)
    void explicitWaitTest() {
        WebDriverWait wait = new WebDriverWait(BaseSetup.driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(synchronizationElements.search));
        synchronizationElements.search.sendKeys("Grocery", Keys.ENTER);
    }
}
