package tests.UI.tests;

import org.testng.annotations.Test;
import tests.UI.base.BaseUITest;
import tests.UI.pages.CreatePlaylist;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.closeWindow;

public class CreatePlaylistTest {

    @Test
    public static void main(String[] args) {
        BaseUITest.main(args);

        $(byXpath(CreatePlaylist.addPlaylistButton)).click();
        $(".tippy-content").shouldHave(text("Log in to create and share playlists."));
        $(".tippy-content").shouldNotHave(text("aaaaaaaaa"));

        $(byXpath(CreatePlaylist.nowNowButton)).click();

        closeWindow();

    }
}
