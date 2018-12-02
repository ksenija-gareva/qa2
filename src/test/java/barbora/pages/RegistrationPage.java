package barbora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
    BaseFunction baseFunction;
    private final By EMAIL = By.xpath("(.//input[@name='email'])[2]");
    private final By PASSWORD = By.xpath("");
    private final By CITY = By.name("city");

    public RegistrationPage(BaseFunction baseFunction) {
        this.baseFunction = baseFunction;
    }

    public void fillEmail(String text) {
        baseFunction.sendKey(EMAIL, text);
    }

    public void selectCity(String city) {
        baseFunction.selectFromDropdown(CITY, city);

    }

}
