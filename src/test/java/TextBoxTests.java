import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class TextBoxTests extends TestBase{

    @Test
    void fillFormTest() {
        Configuration.holdBrowserOpen = true;

        step("Open", () -> {
            open("/text-box");
            executeJavaScript("$('#fixedban').remove()");
            executeJavaScript("$('footer').remove()");
        });

        step("Fill Form", () -> {
            $("[id=userName]").setValue("Alex Tow");
            $("#userEmail").setValue("alex@tow.com");
            $("#currentAddress").setValue("656 Sheppard Ave");
            $("#permanentAddress").setValue("100 Bathurst St.");
            $("#submit").click();
        });

        step("Verify data", ()-> {
            $("#output").shouldHave(
                    text("Alex Tow"),
                    text("alex@tow.com"),
                    text("656 Sheppard Ave"),
                    text("100 Bathurst St."));
        });
    }
}
