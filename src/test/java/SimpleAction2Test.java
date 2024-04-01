import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleAction2Test extends BaseSetup {
    SimpleAction2Elements simpleAction2Elements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.keyfood.com/store/");
        simpleAction2Elements = PageFactory.initElements(BaseSetup.driver, SimpleAction2Elements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void sendKeysTest1() {
        simpleAction2Elements.search.sendKeys("Rice");
    }

    @Test(priority = 1)
    void sendKeysTest2() {
        simpleAction2Elements.search.sendKeys("Milk");
    }

    @Test(priority = 2)
    void sendKeysTest3() {
        simpleAction2Elements.search.sendKeys("Pepsi");
    }

    @Test(priority = 3)
    void sendKeysTest4() {
        simpleAction2Elements.search.sendKeys("Mango");
    }

    @Test(priority = 4)
    void sendKeysTest5() {
        simpleAction2Elements.search.sendKeys("Honey");
        simpleAction2Elements.search.sendKeys(Keys.ADD);
        simpleAction2Elements.search.sendKeys("Nuts");
    }
}
