import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.ArrayList;
import java.util.List;


public class DelfiArticleTitlesTest {

    private final String HOME_PAGE = "http://rus.delfi.lv";
    private final String MOBILE_HOME_PAGE = "http://m.rus.delfi.lv";
    private final By ARTICLE = By.xpath(".//a[@class='top2012-title']");
    private final By MOBILE_ARTICLE = By.xpath(".//a[@class='md-scrollpos']");
    private String Article1 = ("Из первых уст: 8 наблюдений о разнице жизни в Риге и Санкт-Петербурге");
    private String Article2 = ("Троицкий: Латвия и Эстония ошиблись, обращаясь с русскоязычными жителями высокомерно");
    private String Article3 = ("В Даугавпилсской думе фактически развалилась коалиция; \"Согласие\" возвращает влияние");
    private String Article4 = ("В Латвии возникла нехватка вакцин для взрослых против дифтерии");
    private String Article5 = ("Трамп заявил о выходе из договора с Россией о ракетах средней и малой дальности");
    private WebDriver driver;

    @Test
    public void checkArticleTitles() {

        System.setProperty("webdriver.gecko.driver", "/Users/ksenijagareva/Desktop/QA/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(HOME_PAGE);

        List<String> articleTitles = new ArrayList<String>();
        articleTitles.add(Article1);
        articleTitles.add(Article2);
        articleTitles.add(Article3);
        articleTitles.add(Article4);
        articleTitles.add(Article5);

        List<WebElement> articles = driver.findElements(ARTICLE);

        for (int i = 0; i < 5; i++) {
            articles.get(i);

            Assertions.assertEquals(articleTitles.get(i), articles.get(i).getText());
        }

         driver.get(MOBILE_HOME_PAGE);

         List<WebElement> mobileArticles = driver.findElements(MOBILE_ARTICLE);

         for (int m = 0; m < 5; m++) {
             mobileArticles.get(m);

             Assertions.assertEquals(articleTitles.get(m), mobileArticles.get(m).getText());
        }

    }
    @AfterEach
    public void closeDriver() {
        driver.close();
    }

}




