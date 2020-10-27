package api.asserts;

import api.bodies.artist.ArtistBody;
import api.bodies.json.JsonData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class ArtistAssertions {

    public static void checkResponseRightArtistName(ArtistBody artistBody, JsonData jsonData) {
        assertEquals(artistBody.getName(), jsonData.getName(), "Wrong name of artist");
    }

    public static void checkResponseRightArtistId(ArtistBody artistBody, JsonData jsonData) {
        assertEquals(artistBody.getId(), jsonData.getId(), "Wrong id of artist");
    }

    public static void checkUIRightArtistName(WebDriver driver, ArtistBody artistBody) {
        driver.get(artistBody.getExternal_urls().getSpotify());
        assertEquals(driver.findElements(By.cssSelector("h1")).get(1).getText(),
                artistBody.getName(), "Wrong artist in page");
    }
}
