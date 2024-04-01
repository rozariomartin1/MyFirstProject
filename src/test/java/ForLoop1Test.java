import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class ForLoop1Test extends BaseSetup {

    ForLoop1Elements forLoopElements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.keyfood.com/store/");
        forLoopElements = PageFactory.initElements(BaseSetup.driver, ForLoop1Elements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void forLoop1Test() {
        List<WebElement> webElementList1 = driver.findElements(By.xpath("/html/body/main/footer/div[2]/div/div/div[1]/div/div[1]/ul"));
        for (WebElement webElement1:webElementList1) {
            String s1 = webElement1.getText();
            System.out.println(s1);
        }
    }
}
