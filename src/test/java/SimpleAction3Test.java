import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleAction3Test extends BaseSetup {
    SimpleAction3Elements simpleAction3Elements;

    @BeforeMethod
    void starting() {
        openingBrowser("https://www.keyfood.com/store/keyFood/en/login");
        simpleAction3Elements = PageFactory.initElements(BaseSetup.driver, SimpleAction3Elements.class);
    }

    @AfterMethod
    void finishing() {
        closingBrowser();
    }

    @Test(priority = 0)
    void textTest1() {
        simpleAction3Elements.firstName.sendKeys("John");
        simpleAction3Elements.lastName.sendKeys("Smith");
        simpleAction3Elements.registerEmail.sendKeys("myemailaddress@email.com");
        simpleAction3Elements.password.sendKeys("Vtsi-5332");
        simpleAction3Elements.registerCheckPassword.sendKeys("Vtsi-5332");
    }

    @Test(priority = 1)
    void textTest2() {
        System.out.println(simpleAction3Elements.firstName.getAttribute("name"));  //also can use "gettext" methode.
        System.out.println(simpleAction3Elements.lastName.getAttribute("name"));   //also can use "gettext" methode.
        System.out.println(simpleAction3Elements.registerEmail.getAttribute("name"));   //also can use "gettext" methode.
        System.out.println(simpleAction3Elements.password.getAttribute("name"));   //also can use "gettext" methode.
    }
}
