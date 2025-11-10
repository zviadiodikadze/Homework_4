
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class autotest {

    @Test
    public void test1() {
        Configuration.baseUrl = "https://www.google.com";
        Configuration.browserSize = "1920x1080";
        open("https://www.facebook.com/");
        Selenide.$(byLinkText("Create new account")).click();
        Selenide.$(byName("firstname")).setValue("ზვიადი");
        Selenide.$(byName("lastname")).setValue("ოდიკაძე");
        Selenide.$(byName("birthday_month")).selectOption("May");
        Selenide.$(byName("birthday_day")).selectOption("31");
        Selenide.$(byName("birthday_year")).selectOption("2001");

        Selenide.$(byText("Custom")).click();
        sleep(1000);
        //Selenide.$(byClassName("placeholder")).should(Condition.visible);
        //Selenide.$(byId("u_0_e_y3")).selectOption("They: \"Wish them a happy birthday!\"");
        Selenide.$(byText("Male")).click();
        Selenide.$(byName("reg_email__"));//setValue("zviadiodikadze@gmail.com");
        Selenide.$(byText("New password"));//setValue("12345678");
        sleep(2500);


    }
}
