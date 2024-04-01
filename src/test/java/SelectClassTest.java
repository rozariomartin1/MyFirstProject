import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectClassTest extends BaseSetup {

    SelectClassElements selectClassElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.ebay.com/");
        selectClassElements = PageFactory.initElements(BaseSetup.driver, SelectClassElements.class);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void selectByValue1Test() throws InterruptedException {
        selectClassElements.allCategories.click();
        Thread.sleep(1000);
        Select selectByValue1 = new Select(selectClassElements.allCategories);
        selectByValue1.selectByValue("2984");
    }

    @Test(priority = 1)
    void selectByValue2Test() throws InterruptedException {
        selectClassElements.allCategories.click();
        Thread.sleep(1000);
        Select selectByValue2 = new Select(selectClassElements.allCategories);
        selectByValue2.selectByValue("58058");
    }

    @Test(priority = 2)
    void selectByIndex1Test() throws InterruptedException {
        selectClassElements.allCategories.click();
        Thread.sleep(1000);
        Select selectByIndex1 = new Select(selectClassElements.allCategories);
        selectByIndex1.selectByIndex(2);
    }

    @Test(priority = 3)
    void selectByIndex2Test() throws InterruptedException {
        selectClassElements.allCategories.click();
        Thread.sleep(1000);
        Select selectByIndex2 = new Select(selectClassElements.allCategories);
        selectByIndex2.selectByIndex(6);
    }
}
