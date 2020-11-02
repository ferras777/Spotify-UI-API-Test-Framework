package selenium;
import api.bodies.json.JsonData;
import api.requests.ArtistRequests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import ui.base.selenium.SeleniumBase;

import java.io.FileNotFoundException;

import static api.utils.Json.getArtistsDataFromJson;
import static ui.asserts.ArtistUIAssertions.checkUIRightArtistName;

public class ArtistRightNameUITest extends SeleniumBase {

    ArtistRequests artistRequests = new ArtistRequests();

    @DataProvider
    public Object[][] getDataFromJson() throws FileNotFoundException {
        return getArtistsDataFromJson(1);
    }

    @Test(description = "Artist right name UI test", dataProvider = "getDataFromJson")
    public void artistRightNameUiTest(JsonData jsonData) {
        checkUIRightArtistName(driver, artistRequests.getArtistBody(jsonData.getId()));
    }
}
