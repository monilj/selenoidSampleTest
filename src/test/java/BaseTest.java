import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class BaseTest {

    @Test
    public void userCanLoginByUsername() {
        System.setProperty("webdriver.chrome.driver", "/Users/monilj/selenide/firstSelenid/src/test/resources/chromedriver");
        System.setProperty("selenide.browser", "Chrome");
        open("https://www.google.com/");
        $(By.name("q")).setValue("johny").pressEnter();
        System.out.println("searched johny");
    }
}
