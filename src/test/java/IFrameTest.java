import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameTest extends BaseSetup {

    IFrameElements iFrameElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.google.com/");
        iFrameElements = PageFactory.initElements(BaseSetup.driver, IFrameElements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void iFrameTest() throws InterruptedException {
        iFrameElements.googleApps.click();
        Thread.sleep(1000);
        driver.switchTo().frame("app");
        iFrameElements.youtube.click();
        Thread.sleep(2000);
    }
}
