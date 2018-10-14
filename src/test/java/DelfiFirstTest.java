import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DelfiFirstTest {

    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final String HOME_PAGE = "http://rus.delfi.lv";
    private String articleNameToCheck = "Воскресенье стало самым теплым 14 октября в истории метеонаблюдений";


    @Test
    public void checkFirstArticle() {

       //Specify article name !  ASK WHY THIS STEP IS NECESSARY
       // create WebDriver
       // open browser Firefox
       System.setProperty("webdriver.gecko.driver", "/Users/ksenijagareva/Desktop/QA/geckodriver");
       WebDriver driver = new FirefoxDriver();
       // Change window size
       driver.manage().window().maximize();
       // go to page delfi.lv
       driver.get(HOME_PAGE);
       // find WebElement of the first article
       WebElement article = driver.findElement(ARTICLE_TITLE);
       // assert true that this WebElement is first of the list
        Assertions.assertEquals(articleNameToCheck, article.getText(), "This is not true Article!");
    }

}
