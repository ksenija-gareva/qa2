import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationPractice {

    private final String WEB_PAGE = "http://automationpractice.com";
    private final By WOMEN = By.xpath(".//a[@title='Women']");
    private final By DRESSES = By.id("layered_category_8");
    private final By ORANGE = By.id("layered_id_attribute_group_13");
    private WebDriver driver;

    @Test
    public void selectFilters() {

        System.setProperty("webdriver.gecko.driver", "/Users/ksenijagareva/Desktop/QA/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(WEB_PAGE);

        driver.findElement(WOMEN).click();
        driver.findElement(DRESSES).click();
        driver.findElement(ORANGE).click();

    }
    @AfterEach
    public void closeDriver() {
        driver.close();
    }

}
