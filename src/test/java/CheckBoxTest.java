import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseSetup {

    CheckBoxElements checkBoxElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://demoqa.com/checkbox");
        checkBoxElements = PageFactory.initElements(BaseSetup.driver, CheckBoxElements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void checkBoxTest() {
        checkBoxElements.plusButton.click();
        checkBoxElements.notesButton.click();
        checkBoxElements.workSpaceButton.click();
    }
}
