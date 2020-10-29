package api;

import api.bodies.artist.ArtistBody;
import api.bodies.json.JsonData;
import api.listeners.Listener;
import api.requests.ArtistRequests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static api.asserts.ArtistApiAssertions.*;
import static api.utils.Json.getArtistsDataFromJson;

@Listeners(Listener.class)
public class ArtistTests {

    ArtistRequests artistRequests = new ArtistRequests();

    @DataProvider(parallel = true)
    public Object[][] getDataFromJson() throws FileNotFoundException {
        return getArtistsDataFromJson(1);
    }

    @Test(description = "Check right name and id of artist", dataProvider = "getDataFromJson")
    public void checkRightNameAndIdArtist(JsonData jsonData) {
        ArtistBody artistBody = artistRequests.getArtistBody(jsonData.getId());
        checkResponseRightArtistId(artistBody, jsonData);
        checkResponseRightArtistName(artistBody, jsonData);
    }
}
