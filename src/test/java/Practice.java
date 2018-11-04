import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Practice {
    private final By ARTICLE = By.xpath(".//h3[@class = 'top2012-title']");
    private final By ARTICLE_TITLE = By.xpath(".//a[@class = 'top2012-title']");
    private final By COMMENT_COUNT = By.xpath(".//a[@class = 'comment-count']");
    private final By ARTICLE_PAGE = By.xpath(".//span[@itemprop = 'headline name']");
    private final By COMMENT_PAGE = By.xpath(".//a[@class = 'comment-main-title-link']");
    private final By REG_COMMENTS = By.xpath(".//a[contains(@class,'comment-thread-switcher-list-a-reg')]/span");
    private final By ANON_COMMENTS = By.xpath(".//a[contains(@class,'comment-thread-switcher-list-a-anon')]/span");
    private WebDriver driver;

    @Test
    public void delfiPractice() {
        System.setProperty("webdriver.gecko.driver", "/Users/ksenijagareva/Desktop/QA/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://rus.delfi.lv");

        List<WebElement> articles = driver.findElements(ARTICLE);
        WebElement article = articles.get(1);

        String articleTitle = returnText(ARTICLE_TITLE);
        String commentCount = returnText(COMMENT_COUNT);
        Integer count = removeBrackets(commentCount);
        article.click();

        String articlePageTitle = returnText(ARTICLE_PAGE);
        Assertions.assertEquals(articleTitle, articlePageTitle, "Articles not equal");

        String articlePageComment = returnText(COMMENT_COUNT);
        Integer artPageComCount = removeBrackets(articlePageComment);
        Assertions.assertEquals(count, artPageComCount, "Comments in article page not Equal");

        driver.findElement(COMMENT_COUNT).click();

        String commentPageTitle = returnText(COMMENT_PAGE);
        Assertions.assertTrue(commentPageTitle.contains(articleTitle));
        String regComment = returnText(REG_COMMENTS);
        Integer regCommentCount = removeBrackets(regComment);

        String anonComment = returnText(ANON_COMMENTS);
        Integer anonCommentCount = removeBrackets(anonComment);
        Integer sum = regCommentCount + anonCommentCount;

        Assertions.assertEquals(commentCount, sum, "Comments not equal");

    }

    public Integer removeBrackets(String b) {
       return Integer.valueOf(b.substring(1, b.length()-1));
    }

    public String returnText(By locator) {
        return driver.findElement(locator).getText();
    }

    @AfterEach
    public void closeDriver() {
        driver.close();
    }
}