package barbora.pages;

import lekcija7.pages.BaseFunc;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BaseFunction {

    WebDriver driver;

    public BaseFunction() {

        System.setProperty("webdriver.gecko.driver", "/Users/ksenijagareva/Desktop/QA/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public void goToPage(String url) {
        if (!url.contains("http://") && !url.contains("https://")) {
            url = "http://" + url;
        }
        driver.get(url);
    }

    public List<WebElement> getElements(By locator) {
        Assertions.assertFalse(driver.findElements(locator).isEmpty(), "Error 404, not found");
        return driver.findElements(locator);

    }

    public WebElement getWebelement(By locator) {
        Assertions.assertFalse(driver.findElement(locator).isDisplayed(), "Error 404, not found");
        return driver.findElement(locator);
    }

    public void waitForElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void sendKey(By locator, String text) {
        driver.findElement(locator).sendKeys(text);
    }

    public void selectFromDropdown(By locator, String text) {
        Select dropdown = new Select(getWebelement(locator));
        dropdown.selectByVisibleText(text);
    }
}
