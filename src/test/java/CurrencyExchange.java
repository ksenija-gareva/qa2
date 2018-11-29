import org.openqa.selenium.By;

public class CurrencyExchange {

    private final By DELFI_DATE = By.xpath(".//th[@class='currency-table-head']");
    private final By DELFI_CURRENCY = By.xpath("//span[contains(.,'Валюта')]");
    private final By BANK_DATE = By.xpath(".//a[@title='16.11']");
    private final By BANK_VALUE = By.xpath(".//td[@class='value']"); //total=32



}
