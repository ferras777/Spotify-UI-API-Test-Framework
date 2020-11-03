package ui.pages.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@SuppressWarnings("FieldMayBeFinal")
public class WebPlayerPage {

    private SelenideElement enterButton = $(By.cssSelector("[data-testid=\"login-button\"]"));
    private SelenideElement loginField = $(By.id("login-username"));
    private SelenideElement passwordField = $(By.id("login-password"));
    private SelenideElement loginButton = $(By.id("login-button"));
    private ElementsCollection listOfPlaylist = $$(".RootlistItemPlaylist__text-wrapper");
    private ElementsCollection dropdownMenu = $$(".react-contextmenu--visible > .react-contextmenu-item");
    private SelenideElement dropdownMenuDeleteButton = dropdownMenu.get(2);
    private ElementsCollection deletePlaylistPopUpButtons = $$("._6804fe72b2d26f73f6085181" +
            "7886eb67-scss > button");
    private SelenideElement deletePlaylistButton = deletePlaylistPopUpButtons.get(1);

    public void enterButtonClick() {
        enterButton.click();
    }

    public void fillLoginField(String login) {
        loginField.setValue(login);
    }

    public void fillPasswordField(String password) {
        passwordField.setValue(password);
    }

    public void loginButtonClick() {
        loginButton.click();
    }

    public void deletePlaylist() {
        listOfPlaylist.get(0).shouldBe(visible);
        listOfPlaylist.get(0).waitUntil(appear, 1000).contextClick();
        dropdownMenuDeleteButton.waitUntil(appear, 1000).click();
        deletePlaylistButton.click();
        listOfPlaylist.shouldHave(CollectionCondition.size(0), 10000);
    }

    public ElementsCollection getListOfPlaylist() {
        return listOfPlaylist;
    }
}
