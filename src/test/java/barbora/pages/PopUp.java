package barbora.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PopUp {
    BaseFunction baseFunction;
    private final By REGISTER_TAB = By.xpath(".//a[@aria-controls='b-user-register']");

    public PopUp(BaseFunction baseFunction) {
        this.baseFunction = baseFunction;
    }

    public RegistrationPage goToRegistrationPage() {
        baseFunction.waitForElement(REGISTER_TAB);
        baseFunction.getWebelement(REGISTER_TAB).click();
        return new RegistrationPage(baseFunction);
    }
}
