package selenium;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class DeletePlaylistUISelenideTest {




    @Test(description="Selenide ui test")
    public void selenideUiTest() {
        open("https://open.spotify.com/");
        $(By.cssSelector("[data-testid=\"login-button\"]")).click();
        $(By.id("login-username")).sendKeys("yejib76296@zik2zik.com");
        $(By.id("login-password")).sendKeys("qweasd123456");
        $(By.id("login-button")).click();
        $(By.cssSelector(".RootlistItemPlaylist__text-wrapper")).click();
        $(By.cssSelector(".spoticon-ellipsis-32")).click();
        $(By.cssSelector("[title=\"Еще\"]")).click();
        sleep(10000);
        $(By.cssSelector("[title=\"Еще\"]")).click();
    }
}
