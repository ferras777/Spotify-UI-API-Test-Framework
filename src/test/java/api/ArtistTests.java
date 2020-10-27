package api;

import api.bodies.artist.ArtistBody;
import api.bodies.json.JsonData;
import api.requests.ArtistRequests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static api.asserts.ArtistAssertions.checkResponseRightArtistId;
import static api.asserts.ArtistAssertions.checkResponseRightArtistName;
import static api.utils.Json.getArtistsDataFromJson;

public class ArtistTests {

    ArtistRequests artistRequests = new ArtistRequests();

    @DataProvider(parallel = true)
    public Object[][] getDataFromJson() throws FileNotFoundException {
        return getArtistsDataFromJson(1);
    }

    @Test(description = "Check right name of artist", dataProvider = "getDataFromJson")
    public void checkRightNameOfArtist(JsonData jsonData) {
        ArtistBody artistBody = artistRequests.getArtistBody(jsonData.getId());

        checkResponseRightArtistName(artistBody, jsonData);
    }

    @Test(description = "Check right id of artist", dataProvider = "getDataFromJson")
    public void checkRightIdOfArtist(JsonData jsonData) {
        checkResponseRightArtistId(artistRequests.getArtistBody(jsonData.getId()), jsonData);
    }
    
    @Test(description="Check status code with wrong id of artist")
    public void checkStatusCodeWithWrongIdOfArtist() {
        artistRequests.getAnArtistWithWrongId();
    }
}
