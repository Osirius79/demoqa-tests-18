import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void fillFormTest(){
        Configuration.holdBrowserOpen = true;

        open("/text-box");
        $("[id=userName]").setValue("Alex Tow");
        $("#userEmail").setValue("alex@tow.com");
        $("#currentAddress").setValue("656 Sheppard Ave");
        $("#permanentAddress").setValue("100 Bathurst St.");
        $("#submit").click();

        $("#output").shouldHave(
                text("Alex Tow"),
                text("alex@tow.com"),
                text("656 Sheppard Ave"),
                text("100 Bathurst St."));

    }
}
