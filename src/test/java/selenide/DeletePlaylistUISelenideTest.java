package selenide;

import org.testng.annotations.Test;
import ui.pages.selenide.WebPlayerPage;

import static api.utils.Properties.getBaseUrlWebPlayer;
import static api.utils.Properties.getProperty;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static ui.asserts.PlaylistUIAssertions.checkPlaylistsListIsEmpty;

public class DeletePlaylistUISelenideTest {

    WebPlayerPage webPlayerPage = new WebPlayerPage();

    @Test(description = "Selenide ui test")
    public void selenideUiTest() {
        open(getBaseUrlWebPlayer());

        webPlayerPage.enterButtonClick();
        webPlayerPage.fillLoginField(getProperty("login"));
        webPlayerPage.fillPasswordField(getProperty("password"));
        webPlayerPage.loginButtonClick();
        webPlayerPage.deletePlaylist();

        checkPlaylistsListIsEmpty(webPlayerPage);

        closeWebDriver();
    }
}
