import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiFirstTest {

    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final String HOME_PAGE = "http://rus.delfi.lv";
    private String articleNameToCheck = "Семь пишем, 16 в уме. Сколько партий на самом деле будет в новом Сейме";
    private final Logger LOGGER = LogManager.getLogger(DelfiFirstTest.class);
    private WebDriver driver;

    @Test
    public void checkFirstArticle() {

       LOGGER.info("I'm opening browser for my Test");
       System.setProperty("webdriver.gecko.driver", "/Users/ksenijagareva/Desktop/QA/geckodriver");
       driver = new FirefoxDriver();
       driver.manage().window().maximize();
       driver.get(HOME_PAGE);
       WebElement article = driver.findElement(ARTICLE_TITLE);
       Assertions.assertEquals(articleNameToCheck, article.getText(), "This is not true Article!");
    }
    @AfterEach
    public void closeDriver() {
        driver.close();
    }
}
