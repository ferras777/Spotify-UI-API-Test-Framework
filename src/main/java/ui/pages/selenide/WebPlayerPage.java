package ui.pages.selenide;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@SuppressWarnings("FieldMayBeFinal")
public class WebPlayerPage {

    @FindBy(xpath = "//*[data-testid='login-button']")
    private SelenideElement signInButton;

    @FindBy(id = "login-username")
    private SelenideElement loginInput;

    @FindBy(id = "login-password")
    private SelenideElement passwordInput;

    @FindBy(id = "login-button")
    private SelenideElement loginButton;

    @FindBy(css = ".RootlistItemPlaylist")
    private ElementsCollection listOfPlaylist;

    @FindBy(css = ".react-contextmenu")
    private ElementsCollection dropDownMenuButton;

    @FindBy(css = ".delete-button")
    private SelenideElement dropdownMenuDeleteButton;

    @FindBy(css = ".popup-window")
    private ElementsCollection deletePlaylistPopUpButtons;

    @FindBy(css = ".pop-window-delete-button")
    private SelenideElement deletePlaylistButton;

    @Step
    public void enterButtonClick() {
        signInButton.click();
    }

    @Step
    public void fillLoginField(String login) {
        loginInput.setValue(login);
    }

    @Step
    public void fillPasswordField(String password) {
        passwordInput.setValue(password);
    }

    @Step
    public void loginButtonClick() {
        loginButton.click();
    }

    @Step
    public void deletePlaylist() {
        listOfPlaylist.get(0).shouldBe(visible);
        listOfPlaylist.get(0).waitUntil(appear, 1000).contextClick();
        dropdownMenuDeleteButton.waitUntil(appear, 1000).click();
        deletePlaylistButton.click();
        listOfPlaylist.shouldHave(CollectionCondition.size(0), 10000);
    }

    @Step
    public ElementsCollection getListOfPlaylist() {
        return listOfPlaylist;
    }
}
