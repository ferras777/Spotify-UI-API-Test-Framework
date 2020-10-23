package selenium;
import api.bodies.json.JsonData;
import api.requests.ArtistRequests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.base.SeleniumBase;

import java.io.FileNotFoundException;

import static api.asserts.ArtistAssertions.checkUIRightArtistName;
import static api.utils.Json.getArtistsDataFromJson;

public class ArtistRightNameUITest extends SeleniumBase {

    ArtistRequests artistRequests = new ArtistRequests();

    @DataProvider
    public Object[][] getDataFromJson() throws FileNotFoundException {
        return getArtistsDataFromJson();
    }

    @Test(description="Artist right name UI test", dataProvider = "getDataFromJson")
    public void artistRightNameUiTest(JsonData jsonData) {
        checkUIRightArtistName(driver, artistRequests.getArtistBody(jsonData.getId()));
    }
}
