import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxElements {

    @FindBy(xpath = "//div[@id=\"app\"]/div/div/div/div[2]/div[2]/div/div/button[1]")
    WebElement plusButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div/ol/li/ol/li[1]/ol/li[1]/span/label/span[3]")
    WebElement notesButton;

    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[2]/div[1]/ol/li/ol/li[2]/ol/li[1]/span/label/span[3]")
    WebElement workSpaceButton;
}
