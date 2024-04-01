import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTest extends BaseSetup {

    AlertElements alertElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://demoqa.com/alerts");
        alertElements = PageFactory.initElements(BaseSetup.driver, AlertElements.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void alert1Test() {
        alertElements.alertButton.click();
        driver.switchTo().alert().accept();
    }

    @Test(priority = 1)
    void alert2Test() throws InterruptedException {
        alertElements.timeAlertButton.click();
        Thread.sleep(6000);
        driver.switchTo().alert().accept();
    }

    @Test(priority = 2)
    void alert3Test() {
        alertElements.confirmButton.click();
        driver.switchTo().alert().accept();
        alertElements.confirmButton.click();
        driver.switchTo().alert().dismiss();
    }

    @Test(priority = 3)
    void alert4Test() throws InterruptedException {
        alertElements.promtButton.click();
        Thread.sleep(1000);
        driver.switchTo().alert().sendKeys("John");
        driver.switchTo().alert().accept();
    }
}
