package ui.asserts;

import api.bodies.artist.ArtistBody;
import org.openqa.selenium.WebDriver;
import ui.pages.selenium.ArtistPage;

import static org.testng.Assert.assertEquals;

public class ArtistUIAssertions {

    static ArtistPage artistPage = new ArtistPage();

    public static void checkUIRightArtistName(WebDriver driver, ArtistBody artistBody) {
        driver.get(artistBody.getExternal_urls().getSpotify());
        assertEquals(artistPage.getArtistTitle(driver), artistBody.getName(), "Wrong artist in page");
    }
}
