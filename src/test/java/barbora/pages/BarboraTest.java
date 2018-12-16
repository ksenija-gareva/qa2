package barbora.pages;

import org.junit.jupiter.api.Test;

public class BarboraTest {

    private BaseFunction baseFunction = new BaseFunction();
    private final String HOME_PAGE = "www.barbora.lv";

    @Test
    public void barboraTest() {
        baseFunction.goToPage(HOME_PAGE);
        HomePage homePage = new HomePage(baseFunction);
        PopUp popUp = homePage.addToCartByName("CLEMENULES");
        RegistrationPage registrationPage = popUp.goToRegistrationPage();
        registrationPage.fillEmail("email@email.com");
        registrationPage.selectCity("Jūrmala");

        baseFunction.closeDriver();
    }
}
