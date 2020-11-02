package selenide;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import ui.pages.selenide.WebPlayerPage;

import static api.utils.Properties.getBaseUrlWebPlayer;
import static api.utils.Properties.getProperty;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static ui.asserts.PlaylistUIAssertions.checkPlaylistsListIsEmpty;

public class DeletePlaylistUISelenideTest {

    WebPlayerPage webPlayerPage = new WebPlayerPage();

    @Epic(value = "Плейлист")
    @Feature(value = "Тесты плейлиста через UI")
    @Story(value = "Удаление плейлиста через веб плеер")
    @Test(description = "Delete playlist with selenide in Web Player")
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
