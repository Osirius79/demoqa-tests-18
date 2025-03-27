import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class TestBase {
    @BeforeAll
    static void beforeAll() throws MalformedURLException {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub";
//        ChromeOptions options = new ChromeOptions();
//        options.setCapability("browserVersion", "128.0");
//        options.setCapability("selenoid:options", new HashMap<String, Object>() {{
//            /* How to add test badge */
//            put("name", "Test badge...");
//
//            /* How to set session timeout */
//            put("sessionTimeout", "15m");
//
//            /* How to set timezone */
//            put("env", new ArrayList<String>() {{
//                add("TZ=UTC");
//            }});
//
//            /* How to add "trash" button */
//            put("labels", new HashMap<String, Object>() {{
//                put("manual", "true");
//            }});
//
//            /* How to enable video recording */
//            put("enableVideo", true);
//        }});
//        RemoteWebDriver driver = new RemoteWebDriver(new URL("https://selenoid.autotests.cloud/wd/hub"), options);

//        Configuration.browserCapabilities = options;
    }

    @BeforeEach
    void addListener(){
        SelenideLogger.addListener("Allure Selenide", new AllureSelenide());
    }
}
