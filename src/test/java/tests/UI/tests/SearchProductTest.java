package tests.UI.tests;

import org.testng.annotations.Test;
import tests.UI.base.BaseUITest;
import tests.UI.pages.SearchProduct;
import tests.UI.pages.components.Header;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;


public class SearchProductTest {

    @Test
    public static void main(String[] args) {
        BaseUITest.main(args);
        $(byXpath(Header.searchLink)).click();
        $(".CCi1L2OQvgdZvxkRHeKE").shouldHave(text("Browse all"));
        $(byXpath(SearchProduct.searchBar)).setValue("love");
        $("section[aria-label='Songs']").shouldHave(text("love"));
        $("section[aria-label='Songs']").shouldNotHave(text("rrrrrrrrrr"));

        closeWindow();

    }
}
