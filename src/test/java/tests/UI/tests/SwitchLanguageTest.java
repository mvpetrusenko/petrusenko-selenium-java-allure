package tests.UI.tests;

import org.testng.annotations.Test;
import tests.UI.base.BaseUITest;
import tests.UI.pages.SwitchLanguage;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;


public class SwitchLanguageTest {

    @Test
    public static void main(String[] args) {
        BaseUITest.main(args);
        $(byXpath(SwitchLanguage.changeLanguageButton)).click();
        $(byXpath(SwitchLanguage.ukrLanguageButton)).click();

        $("a[href='/search']").shouldHave(text("Пошук"));
        $("a[href='/search']").shouldNotHave(text("Search"));


        closeWindow();

    }
}
