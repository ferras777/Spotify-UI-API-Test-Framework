package selenium;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import ui.base.selenium.SeleniumBase;

public class DeletePlaylistUITest extends SeleniumBase {

    //TODO: complete test
    //todo page objects
    @Test(description = "Delete playlist UI test")
    public void deletePlaylistUiTest() {

        driver.get("https://open.spotify.com/");
        driver.findElement(By.cssSelector("[data-testid=\"login-button\"]")).click();
        driver.findElement(By.id("login-username")).sendKeys("yejib76296@zik2zik.com");
        driver.findElement(By.id("login-password")).sendKeys("qweasd123456");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.cssSelector(".RootlistItemPlaylist__text-wrapper")).click();
        for (int i = 0; i < 100; i++) {
            driver.findElement(By.cssSelector("[title=\"Еще\"]")).click();
            driver.findElement(By.cssSelector("[title=\"Еще\"]")).click();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
