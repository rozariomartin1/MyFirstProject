import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup {
    static WebDriver driver;

    void openingBrowser(String url) {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    void closingBrowser() {
        driver.quit();
    }
}
