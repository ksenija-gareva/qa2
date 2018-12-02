package barbora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {
    BaseFunction baseFunction;
    private final By THE_MANDARIN = By.xpath(".//div[@itemprop='isRelatedTo']");
    private final By NAME = By.xpath(".//span[@itemprop='name']");
    private final By BUTTON = By.xpath(".//button[@aria-label='Pievienot']");

    public HomePage(BaseFunction baseFunction) {
        this.baseFunction = baseFunction;
    }

    public WebElement getItemByName(String name) {
        List<WebElement> products = baseFunction.getElements(THE_MANDARIN);
        for (WebElement we : products) {
            if (we.findElement(NAME).getText().contains(name)) {
                return we;
            }
        }
        return null;
    }

    public PopUp addToCartByName(String name) {
        getItemByName(name).findElement(BUTTON).click();
        return new PopUp(baseFunction);
    }
}


